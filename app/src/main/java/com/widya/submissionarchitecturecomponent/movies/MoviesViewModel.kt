package com.widya.submissionarchitecturecomponent.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.widya.submissionarchitecturecomponent.data.FilmEntity
import com.widya.submissionarchitecturecomponent.data.source.FilmRepository

class MoviesViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getMovies(): LiveData<List<FilmEntity>> = filmRepository.getMovies()
}