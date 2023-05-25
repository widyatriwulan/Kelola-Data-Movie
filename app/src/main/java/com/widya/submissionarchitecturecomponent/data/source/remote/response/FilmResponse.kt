package com.widya.submissionarchitecturecomponent.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilmResponse (
    var filmId: String,
    var title: String,
    var description: String,
    var rilis: String,
    var genre: String,
    var director: String,
    var screenplay: String,
    var image: String
):Parcelable