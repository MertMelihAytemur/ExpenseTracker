package com.example.expensetracker.ui.home.info.expenseinfo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expensetracker.R


class ExpenseInfoFragment : Fragment() {

    //TODO check user gender and user name. 'bey and hanım' words will be add on invisible text. if user male or famale. If user not
    // mentioned, set textview invisible. Save username and user gender in Room and show it to user.


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_expense_info, container, false)
    }

}