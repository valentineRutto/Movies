package com.example.movies.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movies.data.MoviesListRepository
import com.example.movies.ui.MoviesViewModel

class MainViewModelFactory(
    private val repository: MoviesListRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MoviesViewModel(repository) as T
    }
}