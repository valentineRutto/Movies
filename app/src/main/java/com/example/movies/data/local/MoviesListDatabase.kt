package com.example.movies.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movies.data.local.dao.MovieDetailsDao
import com.example.movies.data.local.dao.MoviesListDao
import com.example.movies.data.local.dao.RemoteKeysDao
import com.example.movies.data.local.entities.MovieDetailsEntity
import com.example.movies.data.local.entities.MoviesListEntity
import com.example.movies.data.local.entities.RemoteKeysEntity

@Database(
    exportSchema = false,
    version = 1,
    entities = [MoviesListEntity::class, MovieDetailsEntity::class, RemoteKeysEntity::class]
)
abstract class MoviesListDatabase : RoomDatabase() {
    abstract val moviesListDao: MoviesListDao
    abstract val movieDetailsDao: MovieDetailsDao
    abstract val remoteKeysDao: RemoteKeysDao
}