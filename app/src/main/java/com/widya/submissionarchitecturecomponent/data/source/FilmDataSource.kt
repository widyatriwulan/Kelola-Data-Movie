package com.widya.submissionarchitecturecomponent.data.source

import androidx.lifecycle.LiveData
import com.widya.submissionarchitecturecomponent.data.FilmEntity
import com.widya.submissionarchitecturecomponent.data.TvshowEntity

interface FilmDataSource {

    fun getMovies(): LiveData<List<FilmEntity>>

    fun getTvshow(): LiveData<List<TvshowEntity>>

    fun MovieDetails(filmId: String): LiveData<FilmEntity>

    fun TvshowDetails(tvshowId: String): LiveData<TvshowEntity>

}