package com.example.movies.data

import com.example.movies.BuildConfig
import com.example.movies.data.local.MoviesListDao
import com.example.movies.data.local.MoviesListEntity
import com.example.movies.data.network.Resource
import com.example.movies.data.network.api.ApiService
import com.example.movies.data.network.model.MovieResponse
import com.example.movies.data.network.model.PopularMoviesListResponse

class MoviesListRepository(
    private val apiService: ApiService, private val moviesListDao: MoviesListDao
) {

    suspend fun getSaveMoviesList(): Resource<List<MoviesListEntity>> {

        val moviesList = moviesListDao.getMoviesList()

        if (moviesList.isNotEmpty()) return Resource.Success(moviesList)

        val response = apiService.getMovies(apiKey = BuildConfig.TMDB_API_KEY)

        if (!response.isSuccessful) return Resource.Error(errorMessage = response.message())

        response.body()?.results?.forEach {


        }

        val moviesListEntity = mapResponseToEntity(response.body())

        moviesListDao.saveMoviesList(moviesListEntity)

        return Resource.Success(data = moviesListEntity)
    }

    suspend fun fetchMovieById(id: Int): Resource<MovieResponse> {
        val details = apiService.getVideoUrl(
            id,
            apiKey = BuildConfig.TMDB_API_KEY,
            appendResponse = "videos"
        )

        if (!details.isSuccessful) return Resource.Error(errorMessage = details.message())

        return Resource.Success(data = details.body()!!)

    }

    suspend fun fetchMovie(id: Int): Resource<MoviesListEntity> {
        val movie = moviesListDao.getMovieById(id)
        return Resource.Success(data = movie)
    }

    private fun mapResponseToEntity(moviesListResponse: PopularMoviesListResponse?): List<MoviesListEntity> {
        return moviesListResponse?.results?.map { movie ->
            MoviesListEntity(
                id = movie.id,
                title = movie.originalTitle,
                language = movie.originalLanguage,
                releasedDate = movie.releaseDate,
                overView = movie.overview,
                poster = movie.posterPath,
                popularity = movie.popularity.toString()
            )

        } ?: emptyList<MoviesListEntity>()
    }

}