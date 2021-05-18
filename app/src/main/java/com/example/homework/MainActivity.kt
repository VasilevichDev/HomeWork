package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent = Intent(this, PostcardActivity::class.java)
            startActivity(intent)
        }
    }


    fun onCLickGoToPicture(view: View) {
        val intentPicture = Intent(this, PictureActivity::class.java)
        startActivity(intentPicture)
    }


}
