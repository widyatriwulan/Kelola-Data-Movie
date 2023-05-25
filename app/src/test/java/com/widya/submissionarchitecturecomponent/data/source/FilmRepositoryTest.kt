package com.widya.submissionarchitecturecomponent.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.doAnswer
import com.widya.submissionarchitecturecomponent.data.source.remote.RemoteDataSoure
import com.widya.submissionarchitecturecomponent.utils.DataDummy
import org.junit.Test
import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.verify
import com.widya.submissionarchitecturecomponent.utils.LiveDataTestUtil

class FilmRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSoure::class.java)
    private val filmRepository = FakeFilmRepository(remote)
    private val moviesResponse = DataDummy.generateRemoteMovies()
    private val tvResponse = DataDummy.generateRemoteTvshow()
    private val movieId = moviesResponse[0].filmId
    private val tvshowId = tvResponse[0].tvshowid

    @Test
    fun getMovies() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSoure.LoadMoviesCallback).onAllMoviesReceived(
                moviesResponse
            )
            null
        }.`when`(remote).getMovies(any())
        val movieEntitie = LiveDataTestUtil.getValue(filmRepository.getMovies())
        verify(remote).getMovies(any())
        assertNotNull(movieEntitie)
        assertEquals(moviesResponse.size.toLong(), movieEntitie.size.toLong())

    }

    @Test
    fun getTvshow() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSoure.LoadTvshowCallback).onAllTvshowReceived(
                tvResponse
            )
            null
        }.`when`(remote).getTvshow(any())
        val tvEntitie = LiveDataTestUtil.getValue(filmRepository.getTvshow())
        verify(remote).getTvshow(any())
        assertNotNull(tvEntitie)
        assertEquals(tvResponse.size.toLong(), tvResponse.size.toLong())

    }

    @Test
    fun movieDetails() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSoure.LoadMoviesCallback).onAllMoviesReceived(
                moviesResponse
            )
            null
        }.`when`(remote).getMovies(any())
        val movieEntitie = LiveDataTestUtil.getValue(filmRepository.MovieDetails(movieId))
        verify(remote).getMovies(any())
        assertNotNull(movieEntitie)
        assertNotNull(movieEntitie.title)
        assertNotNull(movieEntitie.rilis)
        assertNotNull(movieEntitie.genre)
        assertNotNull(movieEntitie.description)
        assertNotNull(movieEntitie.image)
        assertEquals(moviesResponse[0].title, movieEntitie.title)
        assertEquals(moviesResponse[0].rilis, movieEntitie.rilis)
        assertEquals(moviesResponse[0].genre, movieEntitie.genre)
        assertEquals(moviesResponse[0].description, movieEntitie.description)
        assertEquals(moviesResponse[0].image, movieEntitie.image)

    }

    @Test
    fun tvshowDetails() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSoure.LoadTvshowCallback).onAllTvshowReceived(
                tvResponse
            )
            null
        }.`when`(remote).getTvshow(any())
        val mtvEntitie = LiveDataTestUtil.getValue(filmRepository.TvshowDetails(tvshowId))
        verify(remote).getTvshow(any())
        assertNotNull(mtvEntitie)
        assertNotNull(mtvEntitie.title)
        assertNotNull(mtvEntitie.tahun)
        assertNotNull(mtvEntitie.genre)
        assertNotNull(mtvEntitie.description)
        assertNotNull(mtvEntitie.image)
        assertEquals(tvResponse[0].title, mtvEntitie.title)
        assertEquals(tvResponse[0].tahun, mtvEntitie.tahun)
        assertEquals(tvResponse[0].genre, mtvEntitie.genre)
        assertEquals(tvResponse[0].description, mtvEntitie.description)
        assertEquals(tvResponse[0].image, mtvEntitie.image)
    }
}