package com.example.movies.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage
import com.example.movies.utils.Constants

@Composable
fun MoviesImageComposable(
    imageUrl: String, modifier: Modifier
) {
    AsyncImage(
        modifier = modifier,
        alignment = Alignment.CenterStart,
        model = Constants.getMoviePoster(imageUrl),
        contentDescription = "movie poster",
    )
}


