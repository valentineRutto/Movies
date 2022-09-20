package com.example.movies.data.network.api

import com.example.movies.BuildConfig
import com.example.movies.data.network.model.MoviesResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/3/movie/550?api_key=${BuildConfig.TMDB_API_KEY}")
    suspend fun getMovies(): Response<MoviesResponse>

}