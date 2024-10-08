package com.example.expensetracker.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.expensetracker.model.UserExpense
import com.example.expensetracker.model.UserInfo

@Database(
    entities = [UserInfo::class,
        UserExpense::class], version = 1, exportSchema = false
)
 abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao() : UserDao

    companion object {
        @Volatile //rights to this field are immediately made visible to other threads.
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }


}