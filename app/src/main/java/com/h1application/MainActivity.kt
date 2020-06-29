package com.h1application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edText = findViewById<EditText>(R.id.edText)

        btnSend.setOnClickListener {
            var text = edText.text.toString()
            if (text.isEmpty()) {
                Toast.makeText(this, "Empty field not allowed!", Toast.LENGTH_SHORT).show()
            } else {
                val typeText = edText.text.toString()
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("Text", typeText)
                startActivityForResult(intent, 1)

            }

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            edText.setText(data?.getStringExtra("Text"))
        }
    }
}

