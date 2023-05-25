package com.widya.submissionarchitecturecomponent.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verify
import com.widya.submissionarchitecturecomponent.data.TvshowEntity
import com.widya.submissionarchitecturecomponent.data.source.FilmRepository
import com.widya.submissionarchitecturecomponent.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailTvShowViewModelTest {
    private lateinit var tvshowViewModel: DetailTvShowViewModel
    private val dummyTvshow = DataDummy.generateDummyTvshow()[0]
    private val tvahowId = dummyTvshow.tvshowid

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var tvshowObserver: Observer<TvshowEntity>

    @Before
    fun setUp(){
        tvshowViewModel = DetailTvShowViewModel(filmRepository)
        tvshowViewModel.setSelectTvshow(tvahowId)

    }

    @Test
    fun getTvshow() {
        val tvshow = MutableLiveData<TvshowEntity>()
        tvshow.value=dummyTvshow

        `when`(filmRepository.TvshowDetails(tvahowId)).thenReturn(tvshow)
        val tvshowEntity = tvshowViewModel.getTvshow().value as TvshowEntity
        verify(filmRepository).TvshowDetails(tvahowId)
        assertNotNull(tvshowEntity)
        assertEquals(dummyTvshow.tvshowid,tvshowEntity.tvshowid)
        assertEquals(dummyTvshow.title,tvshowEntity.title)
        assertEquals(dummyTvshow.tahun,tvshowEntity.tahun)
        assertEquals(dummyTvshow.genre,tvshowEntity.genre)
        assertEquals(dummyTvshow.description,tvshowEntity.description)
        assertEquals(dummyTvshow.image,tvshowEntity.image)

        tvshowViewModel.getTvshow().observeForever(tvshowObserver)
        verify(tvshowObserver).onChanged(dummyTvshow)
    }
}