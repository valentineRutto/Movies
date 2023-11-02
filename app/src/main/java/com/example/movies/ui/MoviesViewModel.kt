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
import kotlinx.coroutines.launch

class MoviesViewModel(private val moviesListRepository: MoviesListRepository) : ViewModel() {

    private val _successfulMovieListResponse = MutableLiveData<List<MoviesListEntity>?>()
    val successfulMovieListResponse: LiveData<List<MoviesListEntity>?>
        get() = _successfulMovieListResponse

    private val _movie = MutableLiveData<MovieDetailsEntity?>()
    val movie: MutableLiveData<MovieDetailsEntity?>
        get() = _movie

    private val _errorMovieListResponse = MutableLiveData<String>()
    val errorMovieListResponse: LiveData<String>
        get() = _errorMovieListResponse

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean>
        get() = _isLoading


    suspend fun getMovies() {
        _isLoading.postValue(true)
        when (val popularMoviesResponse = moviesListRepository.getSaveMoviesList()
        ) {
            is Resource.Success -> {
                _isLoading.postValue(false)
                _successfulMovieListResponse.postValue(popularMoviesResponse.data)
            }
            is Resource.Error -> {
                _isLoading.postValue(false)
                _errorMovieListResponse.postValue(popularMoviesResponse.errorMessage)
            }
        }
    }

    fun fetchMovieList() {
        viewModelScope.launch(Dispatchers.IO) {
            getMovies()
        }
    }

    fun fetchMovieById(id: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            _isLoading.postValue(true)
            getMovieById(id)
        }
    }

    private suspend fun getMovieById(id: Int) {
        when (val movie = moviesListRepository.fetchMovie(id)) {
            is Resource.Success -> {
                _isLoading.postValue(false)
                _movie.postValue(movie.data)
            }
            is Resource.Error -> {
                _isLoading.postValue(false)
                _errorMovieListResponse.postValue(movie.errorMessage)
            }
        }
    }

}