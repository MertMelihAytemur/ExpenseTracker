package com.example.expensetracker.ui.home.addexpense

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.expensetracker.R
import com.example.expensetracker.databinding.FragmentAddExpenseBinding
import com.example.expensetracker.viewmodel.UserViewModel


class AddExpenseFragment : Fragment() {

    private lateinit var userViewModel : UserViewModel
    private lateinit var binding : FragmentAddExpenseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentAddExpenseBinding.inflate(layoutInflater)
        val view = binding.root
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_add_expense, container, false)

        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        binding.buttonAddExpenseSave.setOnClickListener {
            addExpense()
        }
        return view
    }

    private fun addExpense(){
        val expenseDetail = binding.textInputEditTextAddExpenseComment.text.toString()
        val expenseAmount = binding.textInputEditTextAddExpenseAmount.text.toString()
        // for radio buttons
    }

    private fun inputCheck(expenseDetail: String, expenseAmount: Int, expenseType : Int,expenseCurrency: Int): Boolean{
        return true
    //!(TextUtils.isEmpty(firstName)&& TextUtils.isEmpty(lastName)&& TextUtils.isEmpty(age))
    }

    private fun checkRadioButtons() : Int{
        return 0
    }

}