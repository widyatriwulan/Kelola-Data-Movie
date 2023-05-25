package com.widya.submissionarchitecturecomponent.daftar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.widya.submissionarchitecturecomponent.databinding.ActivityDaftarBinding

class DaftarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDaftarBinding = ActivityDaftarBinding.inflate(layoutInflater)
        setContentView(activityDaftarBinding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this,supportFragmentManager)
        activityDaftarBinding.viewPager.adapter = sectionsPagerAdapter
        activityDaftarBinding.tabs.setupWithViewPager(activityDaftarBinding.viewPager)

    }
}