package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class flaganimation_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flaganimation_activity)
    }

    fun onClickGoToAnimation(view: View){
        val intent = Intent(this, animation_activity::class.java)
        startActivity(intent)
    }

    fun onClickGoToFlag(view: View){
        val intent = Intent(this, flag_activity::class.java)
        startActivity(intent)
    }
}