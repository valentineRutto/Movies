package com.example.movies.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.AutoMigrationSpec
import com.example.movies.utils.Constants

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

    companion object {
        @Volatile
        private var INSTANCE: MoviesListDatabase? = null

        fun getDatabase(context: Context): MoviesListDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MoviesListDatabase::class.java,
                    Constants.DB_NAME
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}