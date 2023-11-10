package com.example.movies.di

import android.content.Context
import com.example.movies.data.MoviesListRepository
import com.example.movies.data.local.MoviesListDatabase
import com.example.movies.data.network.RetrofitClient
import com.example.movies.data.network.api.ApiService
import com.example.movies.utils.Constants
import okhttp3.OkHttpClient

class ManualModule(private val context: Context) {
    val provideOKhttpclient: OkHttpClient by lazy {
        RetrofitClient.createOkClient()
    }
    val retrofit by lazy {
        RetrofitClient.createRetrofit(Constants.BASE_URL, provideOKhttpclient)
    }

    val provideRetrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)

    }

    //val application = Application()

    val provideMoviesDatabase by lazy {
        MoviesListDatabase.getDatabase(context)
    }

    val provideMoviesDao by lazy { provideMoviesDatabase.moviesListDao }

    val provideRepository by lazy {
        MoviesListRepository(provideRetrofitService, provideMoviesDao)
    }

}