package com.example.homework.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CarDao {

    @Insert
    suspend fun insertCar(car: Car)

    @Delete
    suspend fun deleteCar(car: Car)

    @Query("SELECT* FROM car_table")
     fun getAll(): Flow<List<Car>>

    @Query("DELETE FROM car_table")
    suspend fun deleteAll()

}