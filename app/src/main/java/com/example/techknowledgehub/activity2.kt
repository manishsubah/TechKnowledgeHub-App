package com.example.techknowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen2card)

        val support = findViewById<Button>(R.id.support)
        val cardandroid = findViewById<CardView>(R.id.cardandroid)
        val cardios = findViewById<CardView>(R.id.cardios)
        val cardblockchain = findViewById<CardView>(R.id.cardblockchain)
        val cardai = findViewById<CardView>(R.id.cardai)
        val cardweb = findViewById<CardView>(R.id.cardweb)
        val cardsecurity = findViewById<CardView>(R.id.cardcyber)

        support.setOnClickListener {
        val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:"+"+919999999999"))
            startActivity(intent)
        }

        cardandroid.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("resId", R.drawable.flutter)
            intent.putExtra("figma", R.drawable.figma)
            intent.putExtra("firebase", R.drawable.firebase)
            intent.putExtra("aws", R.drawable.awsam)
            startActivity(intent)

        }

        cardweb.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("resId", R.drawable.html)
            intent.putExtra("figma", R.drawable.css)
            intent.putExtra("firebase", R.drawable.javascript)
            intent.putExtra("aws", R.drawable.angular)
            startActivity(intent)

        }
        cardios.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("resId", R.drawable.swift)
            intent.putExtra("figma", R.drawable.objectivec)
            intent.putExtra("firebase", R.drawable.database)
            intent.putExtra("aws", R.drawable.flutter)
            startActivity(intent)

        }
        cardblockchain.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("resId", R.drawable.solidity)
            intent.putExtra("figma", R.drawable.javascript)
            intent.putExtra("firebase", R.drawable.react)
            intent.putExtra("aws", R.drawable.node)
            startActivity(intent)

        }
        cardai.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("resId", R.drawable.python)
            intent.putExtra("figma", R.drawable.javascript)
            intent.putExtra("firebase", R.drawable.react)
            intent.putExtra("aws", R.drawable.node)
            startActivity(intent)

        }
        cardsecurity.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("resId", R.drawable.solidity)
            intent.putExtra("figma", R.drawable.javascript)
            intent.putExtra("firebase", R.drawable.react)
            intent.putExtra("aws", R.drawable.node)
            startActivity(intent)

        }
    }
}


