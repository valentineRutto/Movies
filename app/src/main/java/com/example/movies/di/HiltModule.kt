package com.example.movies.di

import android.app.Application
import com.example.movies.data.MoviesListRepository
import com.example.movies.data.local.MoviesListDao
import com.example.movies.data.local.MoviesListDatabase
import com.example.movies.data.network.RetrofitClient
import com.example.movies.data.network.api.ApiService
import com.example.movies.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {
    //Network Module
    @Provides
    @Singleton
    fun provideOKHttpClient() = RetrofitClient.createOkClient()

    @Provides
    @Singleton
    fun provideRetrofitService(retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        RetrofitClient.createRetrofit(Constants.BASE_URL, okHttpClient)

    //Database Module
    @Provides
    @Singleton
    fun provideMoviesDatabase(application: Application) =
        MoviesListDatabase.getDatabase(application)

    @Provides
    @Singleton
    fun provideMoviesDao(database: MoviesListDatabase) = database.moviesListDao

    @Provides
    @Singleton
    fun provideRepository(apiService: ApiService, moviesListDao: MoviesListDao) =
        MoviesListRepository(apiService, moviesListDao)
}