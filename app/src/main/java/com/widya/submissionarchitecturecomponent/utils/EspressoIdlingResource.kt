package com.widya.submissionarchitecturecomponent.utils

import androidx.test.espresso.idling.CountingIdlingResource

object EspressoIdlingResource {
    private const val SOURCE = "OVERALL"
    val idlingResource = CountingIdlingResource(SOURCE)

    fun increment(){
        idlingResource.increment()
    }
    fun decrement(){
        idlingResource.decrement()
    }
}