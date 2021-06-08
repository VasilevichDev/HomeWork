package com.example.homework.coins

import android.util.Log

class CoinRepository {

    private val api = CoinApi.provideRetrofit()

//    suspend fun loadCoins(): List<CoinItem> {
//
//
//        val response = api.getLastCoin()
//
//        return if (response.isSuccessful) {
//            response.body()?.data.orEmpty()
//        } else {
//            Log.e("TAG", response.errorBody().toString())
//            throw Throwable(response.errorBody().toString())
//        }
//    }
}