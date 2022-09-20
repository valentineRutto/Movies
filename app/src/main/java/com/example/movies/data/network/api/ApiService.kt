package com.example.movies.data.network.api

import com.example.movies.data.network.model.PopularMoviesListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/3/movie/popular")
    suspend fun getMovies(
        @Query("page") page: Int? = null,
        @Query("api_key") apiKey: String
    ): Response<PopularMoviesListResponse>

}