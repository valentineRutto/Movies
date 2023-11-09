package com.example.movies.data

import com.example.movies.BuildConfig
import com.example.movies.data.local.MovieDetailsDao
import com.example.movies.data.local.MovieDetailsEntity
import com.example.movies.data.local.MoviesListDao
import com.example.movies.data.local.MoviesListEntity
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

        return Resource.Success(data = moviesListEntity)
    }

}