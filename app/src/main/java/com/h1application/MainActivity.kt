package com.h1application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edText = findViewById<EditText>(R.id.edText)

        btnSend.setOnClickListener {
            val typeText = edText.text.toString()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("Text", typeText)
            startActivity(intent)
        }

    }

}

