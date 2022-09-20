package com.example.movies.ui

import androidx.lifecycle.ViewModel
import com.example.movies.data.network.ApiService

class MoviesViewModel(private val apiService: ApiService) : ViewModel() {
    suspend fun getMovies() = apiService.getMovies()
}