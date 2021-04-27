package com.example.expensetracker.ui.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.expensetracker.R
import com.example.expensetracker.databinding.FragmentOnBoardingFirstBinding



class OnBoardingFirst : Fragment() {

    private lateinit var binding : FragmentOnBoardingFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_on_boarding_first, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.buttonNextToSecond.setOnClickListener {
            viewPager?.currentItem = 1

        }
        return view;
    }

}