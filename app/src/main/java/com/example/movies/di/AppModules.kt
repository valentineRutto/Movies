package com.example.movies.di

import androidx.room.Room
import com.example.movies.App
import com.example.movies.data.MoviesListRepository
import com.example.movies.data.local.MoviesListDatabase
import com.example.movies.data.network.RetrofitClient.createOkClient
import com.example.movies.data.network.RetrofitClient.createRetrofit
import com.example.movies.data.network.api.ApiService
import com.example.movies.ui.MoviesViewModel
import com.example.movies.utils.Constants
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val appModules = module {

    single { App.INSTANCE }
    single<ApiService> { (get() as Retrofit).create(ApiService::class.java) }
    single { createOkClient() }

    single {
        createRetrofit(
            baseUrl = Constants.BASE_URL,
            get()
        )
    }
    single {
        Room.databaseBuilder(androidContext(), MoviesListDatabase::class.java, Constants.DB_NAME)
            .build()
    }

    single { get<MoviesListDatabase>().moviesListDao }

    single { get<MoviesListDatabase>().movieDetailsDao }
    single { get<MoviesListDatabase>().remoteKeysDao }

    single {
        MoviesListRepository(
            apiService = get(),
            moviesListDao = get(),
            movieDetailsDao = get()
        )
    }
    viewModel { MoviesViewModel(moviesListRepository = get()) }
}