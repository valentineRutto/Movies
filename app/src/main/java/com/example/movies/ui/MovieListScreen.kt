package com.example.movies.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MovieListScreen(
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        Text(text = "MovieListScreen")
    }
}

@Preview(name = "MovieListScreen")
@Composable
private fun PreviewMovieListScreen() {
    MovieListScreen()
}