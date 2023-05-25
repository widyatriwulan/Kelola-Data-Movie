package com.widya.submissionarchitecturecomponent.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.widya.submissionarchitecturecomponent.data.TvshowEntity
import com.widya.submissionarchitecturecomponent.data.source.FilmRepository

class TvShowViewModel(private val filmRepository: FilmRepository) : ViewModel() {
    fun getTvShow(): LiveData<List<TvshowEntity>> = filmRepository.getTvshow()
}