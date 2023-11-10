package com.example.movies

import android.app.Application
import com.example.movies.di.ManualModule

class ManualApp : Application() {
       val manualModule = ManualModule(this)


}