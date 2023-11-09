package com.example.movies.utils

object Constants {

    private const val YOUTUBE_VIDEO_URL = "https://www.youtube.com/watch?v="
    private const val YOUTUBE_THUMBNAIL_URL = "https://img.youtube.com/vi/"
    private const val MOVIE_POSTER_URL = "https://image.tmdb.org/t/p/w200/"

    const val BASE_URL = "https://api.themoviedb.org/"
    const val DB_NAME = "movies_list"

    const val PAGING_SIZE = 20

    @JvmStatic
    fun getYoutubeVideoPath(videoPath: String?): String {
        return YOUTUBE_VIDEO_URL + videoPath
    }

    @JvmStatic
    fun getMoviePoster(moviePoster: String?): String {
        return "$MOVIE_POSTER_URL$moviePoster"
    }
}