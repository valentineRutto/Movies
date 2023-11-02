package com.example.movies.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(exportSchema = false, version = 1, entities = [MoviesListEntity::class])
abstract class MoviesListDatabase : RoomDatabase() {
    abstract val moviesListDao: MoviesListDao
    abstract val movieDetailsDao: MovieDetailsDao
}