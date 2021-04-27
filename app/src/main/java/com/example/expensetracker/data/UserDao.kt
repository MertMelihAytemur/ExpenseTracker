package com.example.expensetracker.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.expensetracker.model.UserExpense
import com.example.expensetracker.model.UserInfo
import retrofit2.http.DELETE

@Dao
interface UserDao {

    @Insert
    suspend fun addExpense(userExpense: UserExpense)

    @DELETE
    suspend fun deleteExpense(userExpense: UserExpense)

    @Query("SELECT * FROM user_expense ORDER BY id ASC")
    fun readExpenseData() :LiveData<List<UserExpense>>

    @Update
    suspend fun updateUser(user : UserInfo) //to update user information.
}
