package com.example.the_fan_movie.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.the_fan_movie.R
import com.example.the_fan_movie.databinding.FragmentMovieBinding


class MovieFragment : Fragment(R.layout.fragment_movie) {

    private lateinit var Binding: FragmentMovieBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Binding = FragmentMovieBinding.bind(view)
        Binding.progressBar.visibility = View.GONE
    }

}