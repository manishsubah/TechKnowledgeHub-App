package com.example.techknowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var letgo = findViewById<Button>(R.id.letsgo)

        letgo.setOnClickListener {
        intent = Intent(applicationContext, activity2::class.java)
        startActivity(intent)
        }


    }
}