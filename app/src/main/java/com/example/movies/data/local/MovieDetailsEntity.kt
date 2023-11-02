package com.example.movies.data.local

import androidx.room.Entity

@Entity(tableName = "movieDetails")
data class MovieDetailsEntity(
    val videoName: String,
    val site: String,
    val movieId: Int,
    val videoId: String,
    val type: String,
    val videoPath: String,
    val posterPath: String,
    val overview: String,
    val watchProviderUrl: String? = null,
    val watchProviderName: String? = null
)