package com.example.movies.data

import com.example.movies.BuildConfig
import com.example.movies.data.local.MoviesListDao
import com.example.movies.data.local.MoviesListEntity
import com.example.movies.data.mappers.mapResponseToEntity
import com.example.movies.data.network.Resource
import com.example.movies.data.network.api.ApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

//Koin di
// class MoviesListRepository (
//    private val apiService: ApiService,
//    private val moviesListDao: MoviesListDao,
//) {

//Hilt DI
class MoviesListRepository @Inject constructor(
    private val apiService: ApiService,
    private val moviesListDao: MoviesListDao,
) {
    suspend fun getSaveMovies(): Flow<Resource<List<MoviesListEntity>>> = flow {
        emit(Resource.Loading())
        try {
            val response = apiService.getMovies(apiKey = BuildConfig.TMDB_API_KEY)
            val moviesListEntity = mapResponseToEntity(response.body())
            moviesListDao.saveMoviesList(moviesListEntity)

        } catch (e: HttpException) {
            emit(
                Resource.Error(
                    errorMessage = "Oops, something went wrong!"
                )
            )
        } catch (e: IOException) {
            emit(
                Resource.Error(
                    errorMessage = "Couldn't reach server, check your internet connection."
                )
            )
        }
        val moviesList = moviesListDao.getMoviesList()

        emit(Resource.Success(moviesList))
    }

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
