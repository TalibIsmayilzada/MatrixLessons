package com.talib.matrix

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyViewPagerAdapter(val data: ViewPagerList,fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getCount(): Int = data.listOfFragments.size

    override fun getItem(position: Int): Fragment {
        return data.listOfFragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return data.listOfTitles[position]
    }
}