package com.example.movies.di

import com.example.movies.App
import com.example.movies.data.network.ApiService
import com.example.movies.data.network.RetrofitClient.createOkClient
import com.example.movies.data.network.RetrofitClient.createRetrofit
import org.koin.dsl.module
import retrofit2.Retrofit

val appModules = module {
    single { App.INSTANCE }
    single<ApiService> { (get() as Retrofit).create(ApiService::class.java) }
    single { createOkClient() }

    single {
        createRetrofit(
            baseUrl = "",
            get()
        )
    }



}