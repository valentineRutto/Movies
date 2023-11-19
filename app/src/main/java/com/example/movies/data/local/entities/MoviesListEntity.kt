package com.example.movies.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "moviesList")
data class MoviesListEntity(
    @PrimaryKey
    val id: Int,
    val title: String,
    val language: String,
    val popularity: String,
    val releasedDate: String,
    val poster: String,
    val overView: String
)