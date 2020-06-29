package com.h1application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val type = intent.getStringExtra("Text")
        edReturn.setText(type)

        btnBack.setOnClickListener {
            var text = edReturn.text.toString()
            if (text.isNotEmpty()) {

                val intent = Intent()
                intent.putExtra("Text", text)
                setResult(RESULT_OK, intent)
                finish()

            }

        }
    }
}
