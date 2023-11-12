package com.example.movies

import android.app.Application
import com.example.movies.di.ManualContainer

class ManualApp : Application() {
       val manualModule = ManualContainer(this)
}