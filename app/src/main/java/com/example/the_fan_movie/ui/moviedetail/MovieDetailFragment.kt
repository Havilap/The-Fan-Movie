package com.example.the_fan_movie.ui.moviedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.the_fan_movie.R
import com.example.the_fan_movie.databinding.FragmentMovieDetailBinding


class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    private lateinit var Binding: FragmentMovieDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Binding = FragmentMovieDetailBinding.bind(view)
    }
}