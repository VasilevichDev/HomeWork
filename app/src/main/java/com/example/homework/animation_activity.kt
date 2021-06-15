package com.example.homework

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class animation_activity : AppCompatActivity() {

    lateinit var catAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_activity)
    }

    override fun onStart() {
        super.onStart()
        val catImage = findViewById<ImageView>(R.id.animation_cat).apply {
            setBackgroundResource(R.drawable.cat)
            catAnimation = background as AnimationDrawable
            catAnimation.start()
        }
    }

}