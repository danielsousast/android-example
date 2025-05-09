package com.example.androidexample

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var buttonEnter: Button
    lateinit var buttonRegister: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

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