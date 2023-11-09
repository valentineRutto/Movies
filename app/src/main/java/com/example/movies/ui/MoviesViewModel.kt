package com.example.movies.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movies.data.MoviesListRepository
import com.example.movies.data.local.MovieDetailsEntity
import com.example.movies.data.local.MoviesListEntity
import com.example.movies.data.network.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MoviesViewModel(private val moviesListRepository: MoviesListRepository) : ViewModel() {
    private val _movieList = MutableStateFlow<List<MoviesListEntity>>(emptyList())
    val moviesList = _movieList

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    private val _movie = MutableLiveData<MovieDetailsEntity?>()
    val movie: MutableLiveData<MovieDetailsEntity?>
        get() = _movie

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean>
        get() = _isLoading

    suspend fun getMovies() {
        _isLoading.postValue(true)
        when (val popularMoviesResponse = moviesListRepository.getSaveMoviesList()) {
            is Resource.Success -> {
                _isLoading.postValue(false)
                _movieList.value = popularMoviesResponse.data
            }

            is Resource.Error -> {
                _isLoading.postValue(false)
                _errorMessage.postValue(popularMoviesResponse.errorMessage)
            }

            else -> {}
        }
    }

    fun fetchMovieList() {
        viewModelScope.launch(Dispatchers.IO) {
            getMovies()
        }
    }


}