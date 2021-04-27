package com.example.expensetracker.ui.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.expensetracker.R
import com.example.expensetracker.databinding.FragmentOnBoardingThirdBinding
import com.example.expensetracker.databinding.FragmentViewPagerBinding


class OnBoardingThird : Fragment() {

    private lateinit var binding : FragmentOnBoardingThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_on_boarding_third, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.buttonFinish.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            onBoardingDone()
        }
        return view;
    }

    private fun onBoardingDone(){
        val sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor  = sharedPreferences.edit()
        editor.putBoolean("done",true)
        editor.apply()
    }

}