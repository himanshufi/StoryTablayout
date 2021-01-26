package com.himanshu.customviewpagerapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.himanshu.customviewpagerapp.fragment.ViewPagerFragment

class ViewPagerAdapter(private val list: List<String>,
                             activity: FragmentActivity
): FragmentStateAdapter(activity.supportFragmentManager, activity.lifecycle) {
    override fun getItemCount(): Int = list.size

    override fun createFragment(position: Int): Fragment = ViewPagerFragment
        .getInstance(text = list[position])
}