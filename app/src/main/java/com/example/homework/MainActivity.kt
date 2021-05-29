package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.homework.database.CarMainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDataBAse = findViewById<Button>(R.id.button7)
        buttonDataBAse.setOnClickListener {
            startActivity(Intent(this, CarMainActivity::class.java))
        }
    }


    fun onCLickGoToPicture(view: View) {
        val intent = Intent(this, PictureActivity::class.java)
        startActivity(intent)
    }


}
