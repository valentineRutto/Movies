package com.example.movies

import android.app.Application
import com.example.movies.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class KoinApp : Application() {
    companion object {
        lateinit var INSTANCE: KoinApp
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@KoinApp)
            modules(appModules)
        }
    }
}