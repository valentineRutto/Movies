package com.example.movies.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.movies.data.local.MoviesListEntity
import com.example.movies.databinding.RowMovieBinding


interface onItemClick {
    fun onMovieClick(id: Int, movie: MoviesListEntity)
}

class MoviesAdapter(var itemClickLister: onItemClick) :
    ListAdapter<MoviesListEntity, MoviesAdapter.MovieViewHolder>(diff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return from(parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie, itemClickLister)
    }

    class MovieViewHolder(private val binding: RowMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: MoviesListEntity, itemClickLister: onItemClick) {
            binding.image.load("https://image.tmdb.org/t/p/w200/${movie.poster}")
            binding.txtName.text = movie.title
            binding.container.setOnClickListener {
                itemClickLister.onMovieClick(movie.id, movie)
            }
        }
    }

    companion object {
        fun from(parent: ViewGroup): MovieViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = RowMovieBinding.inflate(layoutInflater, parent, false)
            return MovieViewHolder(binding)
        }

        val diff = object : DiffUtil.ItemCallback<MoviesListEntity>() {
            override fun areItemsTheSame(
                oldItem: MoviesListEntity,
                newItem: MoviesListEntity
            ): Boolean = oldItem == newItem

            override fun areContentsTheSame(
                oldItem: MoviesListEntity,
                newItem: MoviesListEntity
            ): Boolean = oldItem.id == newItem.id
        }
    }
}
