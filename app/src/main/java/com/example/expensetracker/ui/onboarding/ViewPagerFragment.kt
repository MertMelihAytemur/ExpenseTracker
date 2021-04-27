package com.example.expensetracker.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expensetracker.R
import com.example.expensetracker.databinding.FragmentViewPagerBinding
import com.example.expensetracker.ui.adapter.ViewPagerAdapter
import com.example.expensetracker.ui.onboarding.screens.OnBoardingFirst
import com.example.expensetracker.ui.onboarding.screens.OnBoardingSecond
import com.example.expensetracker.ui.onboarding.screens.OnBoardingThird



class ViewPagerFragment : Fragment() {

    private lateinit var binding : FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            OnBoardingFirst(),
            OnBoardingSecond(),
            OnBoardingThird()
        )

        val adapter  = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.viewPager.adapter  = adapter
        return view;
    }

}