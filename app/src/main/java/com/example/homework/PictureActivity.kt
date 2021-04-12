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
        val textUrl = url.text.toString()
        val picture = findViewById<ImageView>(R.id.imageView)
        val button = findViewById<Button>(R.id.Button)

        button.setOnClickListener {
            Picasso.get().load(textUrl).into(picture)
        }

    }

}
