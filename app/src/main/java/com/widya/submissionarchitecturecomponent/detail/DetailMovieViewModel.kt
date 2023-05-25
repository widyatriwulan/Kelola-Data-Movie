package com.widya.submissionarchitecturecomponent.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.widya.submissionarchitecturecomponent.data.FilmEntity
import com.widya.submissionarchitecturecomponent.data.source.FilmRepository

class DetailMovieViewModel(private val filmRepository: FilmRepository) : ViewModel() {
    private lateinit var movieId: String

    fun setSelectMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): LiveData<FilmEntity> = filmRepository.MovieDetails(movieId)

}