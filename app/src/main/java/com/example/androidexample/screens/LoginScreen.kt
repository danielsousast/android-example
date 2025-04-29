package com.example.androidexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class LoginScreen: AppCompatActivity(), View.OnClickListener {
    lateinit var buttonEnter: Button
    lateinit var buttonRegister: Button
    lateinit var editTextEmail: AppEditText
    lateinit var editTextPassword: AppEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        // Button
        buttonEnter = findViewById(R.id.buttonLogin)
        buttonRegister = findViewById(R.id.buttonRegister)
        buttonEnter.setOnClickListener(this)
        buttonRegister.setOnClickListener(this)

        // EditText
        editTextEmail = findViewById(R.id.inputEmail)
        editTextPassword = findViewById(R.id.inputPassword)
    }

    override fun onClick(params: View?) {
        when (params?.id) {
            R.id.buttonLogin -> {
                validateCredentials()
            }

            R.id.buttonRegister -> {
                println("Register pressed")
            }
        }
    }

    fun validateCredentials() {
        val email = editTextEmail.text.toString()
        val password = editTextPassword.text.toString()

        if(email == "joao@silva.com" && password.equals("123")) {
            showModal()
        } else {
            showAlert("Ops", "An error occurred")
        }
    }

    fun showAlert(title: String, description: String) {
        val alert = AlertDialog.Builder(this)
        alert.setTitle(title)
        alert.setMessage(description)
        alert.setPositiveButton("Ok") {
            dialog, _-> dialog.dismiss()
        }

        val dialog: AlertDialog = alert.create()
        dialog.show()
    }

    fun showModal() {
        val bottomSheet = BottomSheetDialog(this)
        val bottomSheetView: View = LayoutInflater.from(applicationContext)
            .inflate(R.layout.bottom_modal, null)

        bottomSheet.setContentView(bottomSheetView)
        bottomSheet.show()
    }
}