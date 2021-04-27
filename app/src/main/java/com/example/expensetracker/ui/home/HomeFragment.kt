package com.example.expensetracker.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.expensetracker.R
import com.example.expensetracker.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
        val view = binding.root
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cardViewUserInfo.setOnClickListener {
            navigateFragment(R.id.action_homeFragment_to_userInfoFragment)
        }

        binding.fabuttonHomeAddExpense.setOnClickListener {
            navigateFragment(R.id.action_homeFragment_to_addExpenseFragment)
        }

    }


    private fun navigateFragment(id : Int){
        findNavController().navigate(id)
    }

}