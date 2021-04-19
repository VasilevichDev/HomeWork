package com.example.homework

import android.icu.number.NumberFormatter.with
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.squareup.picasso.Picasso

class PictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

        val url = findViewById<EditText>(R.id.editText)

        val picture = findViewById<ImageView>(R.id.imageView)
        val button = findViewById<Button>(R.id.Button)

        button.setOnClickListener {

            if (url.text.toString().isEmpty()) {
                url.error = "URL is empty"
            } else {
                Picasso.get().load(url.text.toString()).into(picture)
            }
        }

    }

}


