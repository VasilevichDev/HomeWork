package com.example.homework.database

import kotlinx.coroutines.*
import okhttp3.Dispatcher

class CarRepository(

    private val cardatabase: CarDataBase
) {

    private val dao = cardatabase.carDao()
    private val ioScope = CoroutineScope(Dispatchers.IO)

    fun insert(car: Car) {
        ioScope.launch {
            dao.insertCar(car)
        }
    }

     fun loadAllCar() = dao.getAll()

    fun clearDatabase() {
        ioScope.launch {
            dao.deleteAll()
        }
    }
}