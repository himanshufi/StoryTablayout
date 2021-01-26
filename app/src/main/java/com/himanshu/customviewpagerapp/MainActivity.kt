package com.himanshu.customviewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.himanshu.customviewpagerapp.adapter.ViewPagerAdapter
import com.himanshu.customviewpagerapp.databinding.ActivityMainBinding
import com.himanshu.customviewpagerapp.utils.AdapterData

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.viewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                binding.storyTabLayout.setCurrentViewIndex(position)

            }
        })

        val adapter = ViewPagerAdapter(AdapterData.getTempViewpagerData(), this)
        binding.storyTabLayout.setViewCount(count = AdapterData.getTempViewpagerData().size)
        binding.viewPager.adapter = adapter

    }
}