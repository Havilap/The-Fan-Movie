package com.example.the_fan_movie.data.remote

import com.example.the_fan_movie.data.model.MovieList

class MovieDataSource {

        fun getUpcomingMovies(): MovieList{
            return MovieList()
        }
        fun getTopRatedMovies(): MovieList{
            return MovieList()
        }
        fun getPopularMovies(): MovieList{
            return MovieList()
        }



}