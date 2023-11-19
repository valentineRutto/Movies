package com.example.movies.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.movies.data.local.entities.MoviesListEntity

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