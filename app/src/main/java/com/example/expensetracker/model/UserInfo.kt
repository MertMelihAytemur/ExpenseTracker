package com.example.expensetracker.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "user_info")
data class UserInfo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val Username: String,
    val userGender: Int,
) : Parcelable
