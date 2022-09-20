package com.example.movies.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MoviesListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMoviesList(moviesListEntities: List<MoviesListEntity>)

    @Query("SELECT * FROM moviesList")
    fun getMoviesList(): List<MoviesListEntity>

    @Query("SELECT * FROM moviesList WHERE id LIKE :id")
    suspend fun getMovieById(id: Int): MoviesListEntity

}