package com.example.movies.data.network.api

import com.example.movies.data.network.model.MovieResponse
import com.example.movies.data.network.model.MovieWatchProvidersResponse
import com.example.movies.data.network.model.PopularMoviesListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("/3/movie/popular")
    suspend fun getMovies(
        @Query("page") page: Int? = null,
        @Query("api_key") apiKey: String
    ): Response<PopularMoviesListResponse>

    @GET("/3/movie/{movie_id}")
    suspend fun getVideoUrl(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String,
        @Query("append_response") appendResponse: String
    ): Response<MovieResponse>

    @GET("/3/movie/{movie_id}/watch/providers")
    suspend fun getWatchProviders(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String
    ): Response<MovieWatchProvidersResponse>
}