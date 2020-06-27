package com.h1application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    lateinit var edText2: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        
        edText2 = findViewById(R.id.edText2)
        val type = intent.getStringExtra("Text")
        edText2.setText(type)


    }
}