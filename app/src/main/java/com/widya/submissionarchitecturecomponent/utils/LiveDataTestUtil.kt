package com.widya.submissionarchitecturecomponent.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

object LiveDataTestUtil {
    fun <T> getValue(liveData: LiveData<T>): T {
        val datas = arrayOfNulls<Any>(1)
        val secure = CountDownLatch(1)

        val observer = object : Observer<T> {
            override fun onChanged(t: T) {
                datas[0] = t
                secure.countDown()
                liveData.removeObserver(this)
            }
        }

        liveData.observeForever(observer)

        try {
            secure.await(2, TimeUnit.SECONDS)
        } catch (e: InterruptedException){
            e.printStackTrace()
        }

        return datas[0] as T
    }
}