package com.example.homework

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class AgroViewModel : ViewModel() {

    var position = 0

    var positionOfRegionMinsk = MutableLiveData<Int>()
    var positionOfRegionGomel = MutableLiveData<Int>()
    var positionOfRegionBrest = MutableLiveData<Int>()

    var sumCornMinsk = MutableLiveData<Int>()
    var sumPotatoMinsk = MutableLiveData<Int>()
    var sumCucumberMinsk = MutableLiveData<Int>()

    var sumCornGomel = MutableLiveData<Int>()
    var sumPotatoGomel = MutableLiveData<Int>()
    var sumCucumberGomel = MutableLiveData<Int>()

    var sumCornBrest = MutableLiveData<Int>()
    var sumPotatoBrest = MutableLiveData<Int>()
    var sumCucumberBrest = MutableLiveData<Int>()


    fun beginningWork() {

        viewModelScope.launch {
            var res1 = true
            var cornMinsk = 0
            var potatoMinsk = 0
            var cucumberMinsk = 0

            while (res1) {
                sumCornMinsk.value = cornMinsk
                sumPotatoMinsk.value = potatoMinsk
                sumCucumberMinsk.value = cucumberMinsk
                delay(700)

                if (cornMinsk < 1000) cornMinsk += 70
                else cornMinsk = 1000

                if (potatoMinsk < 1000) potatoMinsk += 60
                else potatoMinsk = 1000

                if (cucumberMinsk < 1000) cucumberMinsk += 80
                else cucumberMinsk = 1000



                if (cornMinsk + potatoMinsk + cucumberMinsk == 3000) {
                    positionOfRegionMinsk.value = ++position
                    res1 = false
                }
            }

        }

        viewModelScope.launch {
            var res2 = true
            var cornGomel = 0
            var potatoGomel = 0
            var cucumberGomel = 0

            while (res2) {
                sumCornGomel.value = cornGomel
                sumPotatoGomel.value = potatoGomel
                sumCucumberGomel.value = cucumberGomel
                delay(600)

                if (cornGomel < 1000) cornGomel += 90
                else cornGomel = 1000

                if (potatoGomel < 1000) potatoGomel += 80
                else potatoGomel = 1000

                if (cucumberGomel < 1000) cucumberGomel += 100
                else cucumberGomel = 1000

                if (cornGomel + potatoGomel + cucumberGomel == 3000) {
                    positionOfRegionGomel.value = ++position
                    res2 = false
                }
            }
        }

        viewModelScope.launch {
            var res3 = true
            var cornBrest = 0
            var potatoBrest = 0
            var cucumberBrest = 0

            while (res3) {
                sumCornBrest.value = cornBrest
                sumPotatoBrest.value = potatoBrest
                sumCucumberBrest.value = cucumberBrest
                delay(800)

                if (cornBrest < 1000) cornBrest += 120
                else cornBrest = 1000

                if (potatoBrest < 1000) potatoBrest += 30
                else potatoBrest = 1000

                if (cucumberBrest < 1000) cucumberBrest += 50
                else cucumberBrest = 1000

                if (cornBrest + potatoBrest + cucumberBrest == 3000) {
                    positionOfRegionBrest.value = ++position
                    res3 = false
                }
            }
        }

    }

}


