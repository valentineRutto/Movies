package com.example.movies.ui

import androidx.lifecycle.ViewModel
import com.example.movies.data.MoviesListRepository

class MoviesViewModel(private val moviesListRepository: MoviesListRepository) : ViewModel() {
    suspend fun getMovies() = moviesListRepository.getSaveMoviesList()
}