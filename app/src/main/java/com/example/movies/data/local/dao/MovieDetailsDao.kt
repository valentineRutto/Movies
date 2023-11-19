package com.example.movies.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.movies.data.local.entities.MovieDetailsEntity

@Dao
interface MovieDetailsDao {
    @Upsert
    fun saveMovieDetailsList(movieDetailsEntity: MovieDetailsEntity)

    @Query("SELECT * FROM movieDetails WHERE movieId LIKE :id")
    suspend fun getMovieById(id: Int): MovieDetailsEntity

}