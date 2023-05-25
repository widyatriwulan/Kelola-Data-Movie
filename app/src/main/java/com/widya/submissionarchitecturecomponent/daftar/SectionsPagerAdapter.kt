package com.widya.submissionarchitecturecomponent.daftar

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.widya.submissionarchitecturecomponent.R
import com.widya.submissionarchitecturecomponent.movies.MoviesFragment
import com.widya.submissionarchitecturecomponent.tvshow.TvShowFragment

class SectionsPagerAdapter(private val mContext : Context, fm : FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment =
        when(position){
            0 -> MoviesFragment()
            1 -> TvShowFragment()
            else -> Fragment()
        }

    override fun getPageTitle(position: Int): CharSequence? = mContext.resources.getString(TAB_TITLE[position])
    companion object{
        @StringRes
        private val TAB_TITLE = intArrayOf(R.string.movies,R.string.tvshow)
    }

}