package com.example.movies.di

import android.content.Context
import com.example.movies.data.MoviesListRepository
import com.example.movies.data.local.MoviesListDatabase
import com.example.movies.data.network.RetrofitClient
import com.example.movies.data.network.api.ApiService
import com.example.movies.utils.Constants
import okhttp3.OkHttpClient

class ManualContainer(private val context: Context) {

    private val provideOKhttpclient: OkHttpClient by lazy {
        RetrofitClient.createOkClient()
    }
    private val retrofit by lazy {
        RetrofitClient.createRetrofit(Constants.BASE_URL, provideOKhttpclient)
    }

    private val provideRetrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    private val provideMoviesDatabase by lazy {
        MoviesListDatabase.getDatabase(context)
    }

    private val provideMoviesDao by lazy { provideMoviesDatabase.moviesListDao }

    val provideRepository by lazy {
        MoviesListRepository(provideRetrofitService, provideMoviesDao)
    }


}

