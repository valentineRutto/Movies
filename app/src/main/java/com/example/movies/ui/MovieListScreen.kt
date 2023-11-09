package com.example.movies.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movies.data.local.MoviesListEntity

@Composable
fun MovieListScreen(
    modifier: Modifier = Modifier,
    viewModel: MoviesViewModel

) {

    LaunchedEffect(true) {
        viewModel.fetchMovieList()
    }

    val movies = viewModel.moviesList.collectAsState().value

    LazyColumn(modifier = modifier.padding(16.dp)) {
        itemsIndexed(movies) { index, movie ->
            movieItem(
                modifier = modifier,
                movie = movie,
            )
        }
    }
}

@Composable
fun movieItem(
    modifier: Modifier,
    movie: MoviesListEntity
) {
    Card(
        shape = RoundedCornerShape(14.dp), backgroundColor = Color.White,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(), elevation = 5.dp
    ) {

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            MoviesImageComposable(
                imageUrl = movie.poster,
                Modifier
                    .size(80.dp, 80.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.align(Alignment.CenterVertically)) {

                Text(text = movie.title, fontSize = 16.sp)

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = movie.releasedDate, fontSize = 16.sp)

            }

        }
    }
}
