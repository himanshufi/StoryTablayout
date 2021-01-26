package com.himanshu.customviewpagerapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.himanshu.customviewpagerapp.R
import com.himanshu.customviewpagerapp.databinding.FragmentViewPagerBinding

private const val TEXT_TAG:String = "TextTag"
class ViewPagerFragment : Fragment() {

    private lateinit var text:String
    private lateinit var binding:FragmentViewPagerBinding

    companion object {
        fun getInstance(text: String): ViewPagerFragment {
            return ViewPagerFragment().also {
                val bundle = Bundle()
                bundle.putString(TEXT_TAG, text)
                it.arguments = bundle
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        text = arguments?.getString(TEXT_TAG, "") ?: ""
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =  FragmentViewPagerBinding.inflate(inflater)

        binding.textView.text = text

        return binding.root
    }
}