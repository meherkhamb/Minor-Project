package com.example.assingnment1

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.etName)
        val etContact: EditText = findViewById(R.id.etContact)
        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val etAddress: EditText = findViewById(R.id.etAddress)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val name = etName.text.toString().trim()
            val contact = etContact.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val address = etAddress.text.toString().trim()

            when {
                name.isEmpty() -> etName.error = "Name is required"
                contact.isEmpty() -> etContact.error = "Contact is required"
                contact.length != 10 || !contact.matches("\\d{10}".toRegex()) ->
                    etContact.error = "Enter a valid 10-digit phone number"
                email.isEmpty() -> etEmail.error = "Email is required"
                !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches() ->
                    etEmail.error = "Enter a valid email address"
                password.isEmpty() -> etPassword.error = "Password is required"
                address.isEmpty() -> etAddress.error = "Address is required"
                else -> {
                    Toast.makeText(this, "Form submitted successfully!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
