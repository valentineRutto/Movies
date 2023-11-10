package com.example.movies.data.network

sealed class Resource<T> {
    class Loading<T>(data: T? = null) : Resource<T>()

    data class Success<T>(val data: T) : Resource<T>()
    data class Error<T>(val errorMessage: String) : Resource<T>()
}