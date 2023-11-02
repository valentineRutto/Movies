package com.example.movies.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface MoviesListDao {
    @Upsert
    fun saveMoviesList(moviesListEntities: List<MoviesListEntity>)

    @Query("SELECT * FROM moviesList")
    fun getMoviesList(): List<MoviesListEntity>

    @Query("SELECT * FROM moviesList")
    fun pagingSource(): PagingSource<Int, MoviesListEntity>

    @Query("SELECT * FROM moviesList WHERE id LIKE :id")
    suspend fun getMovieById(id: Int): MoviesListEntity

}