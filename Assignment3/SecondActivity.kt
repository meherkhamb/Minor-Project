package com.example.assignment3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewDisplay: TextView = findViewById(R.id.textViewDisplay)
        val btnSendToThird: Button = findViewById(R.id.btnSendToThird)

        val string1 = intent.getStringExtra("string1")
        val string2 = intent.getStringExtra("string2")
        val string3 = intent.getStringExtra("string3")
        val string4 = intent.getStringExtra("string4")
        val string5 = intent.getStringExtra("string5")
        val isBoolean = intent.getBooleanExtra("isBoolean", false)
        val intValue = intent.getIntExtra("intValue", 0)
        val floatValue = intent.getFloatExtra("floatValue", 0.0f)

        val displayText = """
            $string1
            $string2
            $string3
            $string4
            $string5
            Boolean: $isBoolean
            Integer: $intValue
            Float: $floatValue
        """.trimIndent()

        textViewDisplay.text = displayText
        Log.d("SecondActivity", displayText)

        btnSendToThird.setOnClickListener {
            val finalString = """
                Final Data: $displayText
            """.trimIndent()
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("finalData", finalString)
            startActivity(intent)
        }
    }
}
