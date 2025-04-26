package com.example.androidexample

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginScreen: AppCompatActivity(), View.OnClickListener {
    lateinit var buttonEnter: Button
    lateinit var buttonRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        buttonEnter = findViewById(R.id.buttonLogin)
        buttonRegister = findViewById(R.id.buttonRegister)
        buttonEnter.setOnClickListener(this)
        buttonRegister.setOnClickListener(this)
    }

    override fun onClick(param: View?) {
        when (param?.id) {
            R.id.buttonLogin -> {
                println("Login pressed")
            }

            R.id.buttonRegister -> {
                println("Register pressed")
            }
        }
    }
}