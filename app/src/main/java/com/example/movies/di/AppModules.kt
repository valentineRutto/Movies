package com.example.movies.di

import androidx.room.Room
import com.example.movies.App
import com.example.movies.data.MoviesListRepository
import com.example.movies.data.local.MoviesListDatabase
import com.example.movies.data.network.RetrofitClient.createOkClient
import com.example.movies.data.network.RetrofitClient.createRetrofit
import com.example.movies.data.network.api.ApiService
import com.example.movies.ui.MoviesViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

private const val DB_NAME = "movies_list"
val appModules = module {

    single { App.INSTANCE }
    single<ApiService> { (get() as Retrofit).create(ApiService::class.java) }
    single { createOkClient() }

    single {
        createRetrofit(
            baseUrl = "https://api.themoviedb.org/3/",
            get()
        )
    }
    single {
        Room.databaseBuilder(androidContext(), MoviesListDatabase::class.java, DB_NAME).build()
    }

    single { get<MoviesListDatabase>().moviesListDao }
    single { MoviesListRepository(apiService = get(), moviesListDao = get()) }
    viewModel { MoviesViewModel(moviesListRepository = get()) }
}