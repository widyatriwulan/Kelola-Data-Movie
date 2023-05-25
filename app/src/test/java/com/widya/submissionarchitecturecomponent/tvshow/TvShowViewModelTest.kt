package com.widya.submissionarchitecturecomponent.tvshow

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
class TvShowViewModelTest {
    private lateinit var tvViewModel : TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer :Observer<List<TvshowEntity>>
    @Before
    fun setUp(){
        tvViewModel = TvShowViewModel(filmRepository)
    }
    @Test
    fun getTvShow() {
        val dummyTvshow = DataDummy.generateDummyTvshow()
        val tvshow = MutableLiveData<List<TvshowEntity>>()
        tvshow.value = dummyTvshow

        `when`(filmRepository.getTvshow()).thenReturn(tvshow)
        val tvshowEntities = tvViewModel.getTvShow().value
        verify(filmRepository).getTvshow()
        assertNotNull(tvshowEntities)
        assertEquals(10,tvshowEntities?.size)

        tvViewModel.getTvShow().observeForever(observer)
        verify(observer).onChanged(dummyTvshow)
    }
}