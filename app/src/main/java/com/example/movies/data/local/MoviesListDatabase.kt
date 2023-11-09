package com.example.movies.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.AutoMigrationSpec

@Database(
    exportSchema = false,
    version = 1,
    entities = [MoviesListEntity::class]
//    autoMigrations = [
//        AutoMigration (
//            from = 1,
//            to = 2,
//            spec = MoviesListDatabase.MyAutoMigration::class
//        )
//    ]
)
abstract class MoviesListDatabase : RoomDatabase() {
    abstract val moviesListDao: MoviesListDao

    class MyAutoMigration : AutoMigrationSpec
}