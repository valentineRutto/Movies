package com.example.movies.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import coil.load
import com.example.movies.databinding.FragmentSecondBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val moviesViewmodel by sharedViewModel<MoviesViewModel>()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        moviesViewmodel.movie.observe(viewLifecycleOwner) { movie ->
            binding.txtName.text = movie?.title
            binding.txtOverview.text = movie?.overView
            binding.image.load("https://image.tmdb.org/t/p/w200/${movie?.poster}")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}