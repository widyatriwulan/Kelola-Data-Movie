package com.widya.submissionarchitecturecomponent.utils

import android.content.Context
import com.widya.submissionarchitecturecomponent.data.source.remote.response.FilmResponse
import com.widya.submissionarchitecturecomponent.data.source.remote.response.TvShowResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class DataJsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<FilmResponse> {
        val listMovies = ArrayList<FilmResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("movie.json").toString())
            val listArrayMovies = responseObject.getJSONArray("film")
            for (i in 0 until listArrayMovies.length()) {
                val movies = listArrayMovies.getJSONObject(i)

                val filmId = movies.getString("filmId")
                val title = movies.getString("title")
                val description = movies.getString("description")
                val rilis = movies.getString("rilis")
                val genre = movies.getString("genre")
                val director = movies.getString("director")
                val screenplay = movies.getString("screenplay")
                val image = movies.getString("image")

                val movieResponse = FilmResponse(
                    filmId,
                    title,
                    description,
                    rilis,
                    genre,
                    director,
                    screenplay,
                    image
                )
                listMovies.add(movieResponse)

            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return listMovies
    }


    fun loadTvShow(): List<TvShowResponse> {
        val listTvsShow = ArrayList<TvShowResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("tvshow.json").toString())
            val listArrayTv = responseObject.getJSONArray("tvshows")
            for (i in 0 until listArrayTv.length()) {
                val tvshow = listArrayTv.getJSONObject(i)

                val tvshowId = tvshow.getString("tvshowid")
                val title = tvshow.getString("title")
                val description = tvshow.getString("description")
                val tahun = tvshow.getString("tahun")
                val genre = tvshow.getString("genre")
                val image = tvshow.getString("image")

                val tvshowResponse =
                    TvShowResponse(tvshowId, title, description, tahun, genre, image)
                listTvsShow.add(tvshowResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return listTvsShow
    }
}