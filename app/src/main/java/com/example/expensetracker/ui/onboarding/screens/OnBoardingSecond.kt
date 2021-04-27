package com.example.expensetracker.ui.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.expensetracker.R
import com.example.expensetracker.databinding.FragmentOnBoardingSecondBinding


class OnBoardingSecond : Fragment() {

    private lateinit var binding : FragmentOnBoardingSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_on_boarding_second, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.buttonNextToThird.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return view;
    }

}