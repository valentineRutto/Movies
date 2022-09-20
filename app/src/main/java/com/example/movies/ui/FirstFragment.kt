package com.example.movies.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.movies.databinding.FragmentFirstBinding
import com.example.movies.ui.adapters.MoviesAdapter
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    private val moviesViewmodel by sharedViewModel<MoviesViewModel>()

    private var _binding: FragmentFirstBinding? = null
    private lateinit var moviesAdapter: MoviesAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        moviesAdapter = MoviesAdapter()

        setupObservables()

//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
    }

    fun setupObservables() {

        moviesViewmodel.isLoading.observe(viewLifecycleOwner) { showLoading ->
            binding.moviesProgressBar.isVisible = showLoading
        }

        moviesViewmodel.errorMovieListResponse.observe(viewLifecycleOwner) { errorMsg ->
            binding.moviesErrorTextView.text = errorMsg
        }

        moviesViewmodel.successfulMovieListResponse.observe(viewLifecycleOwner) { citiesResponse ->
            binding.moviesRecyclerView.adapter = moviesAdapter.apply {
                submitList(citiesResponse)
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}