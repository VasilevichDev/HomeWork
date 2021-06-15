package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.lifecycle.ViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onCLickGoToPicture(view: View) {
        val intent = Intent(this, PictureActivity::class.java)
        startActivity(intent)
    }


    fun onClickGoToMaterial (view: View){
        val intent = Intent(this,MaterialActivity::class.java)
        startActivity(intent)
    }


    fun onCLickGoToAgro(view: View) {
        val intent = Intent(this, Agro::class.java)
        startActivity(intent)
    }


    fun onCLickGoToDZ2(view: View) {
        val intent = Intent(this, flaganimation_activity::class.java)
        startActivity(intent)
    }


}
