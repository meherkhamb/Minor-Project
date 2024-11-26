package com.example.assignment2

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val btnChangeText: Button = findViewById(R.id.btnChangeText)
        val btnChangeHeight: Button = findViewById(R.id.btnChangeHeight)
        val btnCenterText: Button = findViewById(R.id.btnCenterText)

        // Change Text of TextView
        btnChangeText.setOnClickListener {
            textView.text = "Text Changed!"
        }

        // Change Height of TextView
        btnChangeHeight.setOnClickListener {
            textView.layoutParams.height = 200 // Set height to 200px
            textView.requestLayout() // Refresh layout
        }

        // Center Text in TextView
        btnCenterText.setOnClickListener {
            textView.gravity = Gravity.CENTER
        }
    }
}
