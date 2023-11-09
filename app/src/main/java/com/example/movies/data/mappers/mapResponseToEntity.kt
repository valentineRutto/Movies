package com.example.movies.data.mappers

import com.example.movies.data.local.MovieDetailsEntity
import com.example.movies.data.local.MoviesListEntity
import com.example.movies.data.network.model.MovieResponse
import com.example.movies.data.network.model.PopularMoviesListResponse

fun mapResponseToEntity(moviesListResponse: PopularMoviesListResponse?): List<MoviesListEntity> {
    return moviesListResponse?.results?.map { movie ->
        MoviesListEntity(
            id = movie.id,
            title = movie.originalTitle,
            language = movie.originalLanguage,
            releasedDate = movie.releaseDate,
            overView = movie.overview,
            poster = movie.posterPath,
            popularity = movie.popularity.toString()
        )

    } ?: emptyList<MoviesListEntity>()
}

fun mapResponseToVideoDetailsEntity(movie: MovieResponse?): MovieDetailsEntity {
    val videoDetails = movie?.videos?.results?.get(1)
    return MovieDetailsEntity(
        videoName = movie?.originalTitle!!,
        site = videoDetails?.site,
        movieId = movie.id!!,
        videoId = videoDetails?.id!!,
        type = videoDetails?.type!!,
        videoPath = videoDetails?.key!!, posterPath = movie.posterPath!!, overview = movie.overview!!
    )

}
