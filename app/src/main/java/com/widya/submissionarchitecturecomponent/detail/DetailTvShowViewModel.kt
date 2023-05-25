package com.widya.submissionarchitecturecomponent.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.widya.submissionarchitecturecomponent.data.TvshowEntity
import com.widya.submissionarchitecturecomponent.data.source.FilmRepository

class DetailTvShowViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    private lateinit var tvshowId: String

    fun setSelectTvshow(tvshowId: String) {
        this.tvshowId = tvshowId
    }

    fun getTvshow(): LiveData<TvshowEntity> = filmRepository.TvshowDetails(tvshowId)

}