package com.example.expensetracker.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.expensetracker.data.UserDatabase
import com.example.expensetracker.model.UserExpense
import com.example.expensetracker.model.UserInfo
import com.example.expensetracker.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application) {

    val readExpenseData: LiveData<List<UserExpense>>
    private val repository: UserRepository

    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        readExpenseData = repository.readExpenseData
    }

    fun updateUser(userInfo : UserInfo){
        viewModelScope.launch(Dispatchers.IO){
            repository.updateUser(userInfo)
        }
    }

    fun addExpense(userExpense: UserExpense){
        viewModelScope.launch(Dispatchers.IO){
            repository.addExpense(userExpense)
        }
    }

    fun deleteExpense(userExpense: UserExpense){
        viewModelScope.launch(Dispatchers.IO){
            repository.deleteExpense(userExpense)
        }
    }

}