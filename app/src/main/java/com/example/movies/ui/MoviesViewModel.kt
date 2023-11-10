package com.example.movies.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movies.data.MoviesListRepository
import com.example.movies.data.local.MoviesListEntity
import com.example.movies.data.network.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//Koin &manual viewmodel
class MoviesViewModel(private val moviesListRepository: MoviesListRepository) :
    ViewModel() {
//@HiltViewModel
//class MoviesViewModel @Inject constructor(private val moviesListRepository: MoviesListRepository) :
//    ViewModel() {

    private val _state = mutableStateOf(MovieUiState())
    val state: State<MovieUiState> = _state

    private suspend fun getMovies() {
        when (val popularMoviesResponse = moviesListRepository.getSaveMoviesList()) {
            is Resource.Success -> {
                _state.value = state.value.copy(
                    moviesList = popularMoviesResponse.data,
                    isLoading = false
                )

            }

            is Resource.Error -> {
                _state.value = state.value.copy(
                    moviesList = emptyList(),
                    isLoading = false
                )
            }

            is Resource.Loading -> {
                _state.value = state.value.copy(
                    moviesList = emptyList(),
                    isLoading = true
                )
            }
        }
    }

    fun fetchMovieList() {
        viewModelScope.launch(Dispatchers.IO) {
            getMovies()
        }
    }

    data class MovieUiState(
        val moviesList: List<MoviesListEntity> = emptyList(),
        val isLoading: Boolean = false
    )
}