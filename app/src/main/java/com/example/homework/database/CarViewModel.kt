package com.example.homework.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CarViewModel (application: Application) : AndroidViewModel(application) {

    private val carRepository = CarRepository(CarDataBase.getDataBase(application))
    private val ioScope = CoroutineScope(Dispatchers.IO)

    private val _isLoading = MutableLiveData <Boolean> ()
    val isLoading : LiveData <Boolean> = _isLoading

    private val _carList = MutableLiveData <List<Car>>()
    val  carList : LiveData<List<Car>> = _carList

    val flowCarList = carRepository.loadAllCar()

    fun insert (car :Car){
        carRepository.insert(car)
    }

    fun loadAllCar () {
//        _isLoading.value = true
//        ioScope.launch {
//            val carList = carRepository.loadAllCar()
//            _carList.postValue(carList)
//            _isLoading.postValue(false)
//        }
    }

    fun clearDataBase(){
        carRepository.clearDatabase()
        loadAllCar()
    }

}