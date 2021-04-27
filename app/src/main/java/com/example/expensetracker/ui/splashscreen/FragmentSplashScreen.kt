package com.example.expensetracker.ui.splashscreen

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.expensetracker.R

class FragmentSplashScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({
            if(checkOnBoardingDone()){
                findNavController().navigate(R.id.action_fragmentSplashScreen_to_homeFragment)
            }else
                findNavController().navigate(R.id.action_fragmentSplashScreen_to_viewPagerFragment)
        },3500)

       /* val topAnimation : Animation? = AnimationUtils.loadAnimation(context,R.anim.top_animation)
        val bottomAnimation: Animation? = AnimationUtils.loadAnimation(context,R.anim.bottom_animation)

        splashTextView.animation = bottomAnimation
        splashAnimation.animation = topAnimation
        */

        return inflater.inflate(R.layout.fragment_splash_screen,container,false)
    }

    private fun checkOnBoardingDone() : Boolean{
        val sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("done",false)
    }
}