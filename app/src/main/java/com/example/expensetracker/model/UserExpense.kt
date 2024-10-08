package com.example.expensetracker.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "user_expense")
data class UserExpense(
    @PrimaryKey(autoGenerate = true)
    val id : Int,

    val expenseAmount: Int,
    val expenseDetail: String,
    val expenseType: Int,
    val expenseCurrency: Int,
) : Parcelable
