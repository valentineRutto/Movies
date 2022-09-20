package com.example.movies.di

import com.example.movies.App
import com.example.movies.data.network.RetrofitClient.createOkClient
import com.example.movies.data.network.RetrofitClient.createRetrofit
import com.example.movies.data.network.api.ApiService
import com.example.movies.ui.MoviesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val appModules = module {
    single { App.INSTANCE }
    single<ApiService> { (get() as Retrofit).create(ApiService::class.java) }
    single { createOkClient() }

    single {
        createRetrofit(
            baseUrl = "https://api.themoviedb.org/",
            get()
        )
    }

    viewModel { MoviesViewModel(apiService = get()) }
}