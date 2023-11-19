package com.example.movies.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movieDetails")
data class MovieDetailsEntity(
    val videoName: String,
    val site: String,
    val movieId: Int,
    @PrimaryKey
    val videoId: String,
    val type: String,
    val videoPath: String,
    val posterPath: String,
    val overview: String,
    val watchProviderUrl: String? = null,
    val watchProviderName: String? = null
)