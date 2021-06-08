package com.example.homework.coins

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.filterNotNull

class CoinViewModel : ViewModel() {

//    private val coinRepo = CoinRepository()
//
//    private val mutableCoinList: MutableStateFlow<List<CoinItem>?> = MutableStateFlow(null)
//    val flowCoinList = mutableCoinList
//        .filterNotNull()
//        .filter { it.isNotEmpty() }
//
//    suspend fun getLatestCoins() {
//        val test = coinRepo.loadCoins()
//        mutableCoinList.emit(test)
//        Log.e("TAG", test.toString())
//
//    }

}