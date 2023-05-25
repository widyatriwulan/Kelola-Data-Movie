package com.widya.submissionarchitecturecomponent.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvShowResponse(
    var tvshowid : String,
    var title : String,
    var description : String,
    var tahun : String,
    var genre : String,
    var image : String
):Parcelable
