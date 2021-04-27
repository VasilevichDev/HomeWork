package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MaterialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material)

        val button = findViewById<Button>(R.id.button_password)
        val textFieldPassword = findViewById<TextInputEditText>(R.id.textField1_2)
        val textFieldLogin = findViewById<TextInputEditText>(R.id.textField2_2)
        val textHelperPassword = findViewById<TextInputLayout>(R.id.textField_1)
        val textHelperLogin = findViewById<TextInputLayout>(R.id.textField_2)

        button.setOnClickListener {

            if (textFieldPassword.text.toString().isEmpty()) {
                textHelperPassword.error = "password is empty"
                return@setOnClickListener
            } else
                if (textFieldPassword.text.toString().length < 8){
                    textHelperPassword.error = "password is too short"
                return@setOnClickListener}

            if (textFieldLogin.text.toString().isEmpty()){
                textHelperLogin.error = "login is empty"
                return@setOnClickListener}

            MaterialAlertDialogBuilder(this)
                .setTitle(R.string.successful_registration)
                .setPositiveButton(resources.getString(R.string.ok)) { dialog, which -> dialog.dismiss() }
                .setNeutralButton(resources.getString(R.string.check_in)) { dialog, which ->
                    val intent = Intent(this, WelcomeActivity::class.java)
                    intent.putExtra(TAG, textFieldLogin.text.toString())
                    startActivity(intent)
                }.show()
        }
    }
}