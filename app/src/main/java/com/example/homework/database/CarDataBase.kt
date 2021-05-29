package com.example.homework.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Car::class],version = 1)
abstract class CarDataBase : RoomDatabase() {

    abstract fun carDao() : CarDao

    companion object {
        var INSTANCE: CarDataBase? = null

        fun getDataBase(context: Context): CarDataBase {
            return if (INSTANCE == null) {
                INSTANCE =
                    Room.databaseBuilder(context, CarDataBase::class.java, "cardatabase").build()
                INSTANCE as CarDataBase
            } else return INSTANCE as CarDataBase
        }
    }
}