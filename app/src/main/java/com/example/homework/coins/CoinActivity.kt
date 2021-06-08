package com.example.homework.coins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.homework.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CoinActivity : AppCompatActivity() {

//    private val viewModel by lazy { ViewModelProvider(this).get(CoinViewModel::class.java) }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_coin)
//
//        lifecycleScope.launch(Dispatchers.IO) {
//            viewModel.getLatestCoins()
//        }
//
//
//    }
}