package com.example.movies.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface MovieDetailsDao {
    @Upsert
    fun saveMovieDetailsList(movieDetailsEntity: MovieDetailsEntity)

    @Query("SELECT * FROM movieDetails WHERE movieId LIKE :id")
    suspend fun getMovieById(id: Int): MovieDetailsEntity

}