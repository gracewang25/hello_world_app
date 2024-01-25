package com.example.helloworld


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonHello: Button
    private lateinit var textHello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonHello = findViewById(R.id.buttonHello)
        textHello = findViewById(R.id.textHello)


        buttonHello.setOnClickListener {
            if (textHello.visibility == TextView.VISIBLE) {
                textHello.visibility = TextView.GONE
            } else {
                textHello.visibility = TextView.VISIBLE
                textHello.text = "Hello World!"
            }
        }
    }
}