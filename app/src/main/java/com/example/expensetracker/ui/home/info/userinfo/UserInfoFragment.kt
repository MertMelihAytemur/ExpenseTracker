package com.example.expensetracker.ui.home.info.userinfo

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.expensetracker.R
import com.example.expensetracker.databinding.FragmentUserInfoBinding
import com.example.expensetracker.model.UserInfo
import com.example.expensetracker.viewmodel.UserViewModel


class UserInfoFragment : Fragment() {

    private lateinit var userViewModel : UserViewModel
    private lateinit var binding : FragmentUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentUserInfoBinding.inflate(layoutInflater)
        val view = binding.root
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        binding.buttonUserInfoSave.setOnClickListener {
            updateUserInfo()
        }
        return inflater.inflate(R.layout.fragment_user_info, container, false)
    }

    private fun updateUserInfo(){
        val username = binding.textInputEditTextUserInfoUsername.toString().trim()
        val userGender = checkRadioGroupId()

        if(inputCheck(username)){
            val update = UserInfo(0,username,Integer.parseInt(userGender.toString()))
            userViewModel.updateUser(update)

            Toast.makeText(requireContext(),"successfully updated!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_userInfoFragment_to_homeFragment)
        }else
            Toast.makeText(requireContext(),"Missed parts", Toast.LENGTH_SHORT).show()
    }

    private fun inputCheck(username : String): Boolean{
        return !(TextUtils.isEmpty(username))
    }

    private fun checkRadioGroupId() : Int{
        return binding.radioGroupUserGender!!.checkedRadioButtonId
    }

}