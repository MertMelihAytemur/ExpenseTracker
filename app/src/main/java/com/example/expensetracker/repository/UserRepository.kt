package com.example.expensetracker.repository

import androidx.lifecycle.LiveData
import com.example.expensetracker.data.UserDao
import com.example.expensetracker.model.UserExpense
import com.example.expensetracker.model.UserInfo

class UserRepository(private val userDao : UserDao) {

    val readExpenseData: LiveData<List<UserExpense>> = userDao.readExpenseData()

    suspend fun updateUser(userInfo : UserInfo){
        userDao.updateUser(userInfo)
    }

    suspend fun deleteExpense(userExpense : UserExpense){
        userDao.deleteExpense(userExpense)
    }

    suspend fun addExpense(userExpense: UserExpense){
        userDao.addExpense(userExpense)
    }

}