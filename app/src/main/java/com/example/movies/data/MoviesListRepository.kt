package com.example.movies.data

import com.example.movies.BuildConfig
import com.example.movies.data.local.dao.MovieDetailsDao
import com.example.movies.data.local.dao.MoviesListDao
import com.example.movies.data.local.entities.MovieDetailsEntity
import com.example.movies.data.local.entities.MoviesListEntity
import com.example.movies.data.mappers.mapResponseToEntity
import com.example.movies.data.mappers.mapResponseToVideoDetailsEntity
import com.example.movies.data.network.Resource
import com.example.movies.data.network.api.ApiService

class MoviesListRepository(
    private val apiService: ApiService,
    private val moviesListDao: MoviesListDao,
    private val movieDetailsDao: MovieDetailsDao
) {

    suspend fun getSaveMoviesList(): Resource<List<MoviesListEntity>> {

        val moviesList = moviesListDao.getMoviesList()

        if (moviesList.isNotEmpty()) return Resource.Success(moviesList)

        val response = apiService.getMovies(apiKey = BuildConfig.TMDB_API_KEY)

        if (!response.isSuccessful) return Resource.Error(errorMessage = response.message())

        val moviesListEntity = mapResponseToEntity(response.body())

        moviesListDao.saveMoviesList(moviesListEntity)

        getSaveMovieDetails()

        return Resource.Success(data = moviesListEntity)
    }

    suspend fun fetchMovieById(id: Int): Resource<MovieDetailsEntity> {

        val details = apiService.getVideoUrl(
            id,
            apiKey = BuildConfig.TMDB_API_KEY,
            appendResponse = "videos"
        )

        if (!details.isSuccessful) return Resource.Error(errorMessage = details.message())

        val movieDetails = mapResponseToVideoDetailsEntity(details.body()!!)

        movieDetailsDao.saveMovieDetailsList(movieDetails)

        return Resource.Success(data = movieDetails)

    }

    suspend fun getSaveMovieDetails() {

        moviesListDao.getMoviesList().forEach { moviesListEntity ->
            fetchMovieById(moviesListEntity.id)
        }

    }

    suspend fun fetchMovie(id: Int): Resource<MovieDetailsEntity> {
        fetchMovieById(id)

        val movie = movieDetailsDao.getMovieById(id)

        return Resource.Success(data = movie)
    }


}