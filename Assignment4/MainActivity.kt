package com.example.assignment4

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter = 0 // Counter for Button 1 action

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val btnChangeText: Button = findViewById(R.id.btnChangeText)
        val btnChangeHeight: Button = findViewById(R.id.btnChangeHeight)
        val btnCenterText: Button = findViewById(R.id.btnCenterText)

        // Button 1: Change Text (increment counter or display message)
        btnChangeText.setOnClickListener {
            counter++
            textView.text = "Button clicked $counter times!"
        }

        // Button 2: Change Height of TextView
        btnChangeHeight.setOnClickListener {
            textView.layoutParams.height = 200 // Change height to 200px
            textView.requestLayout() // Refresh layout
        }

        // Button 3: Center TextView
        btnCenterText.setOnClickListener {
            textView.gravity = Gravity.CENTER
        }
    }
}
