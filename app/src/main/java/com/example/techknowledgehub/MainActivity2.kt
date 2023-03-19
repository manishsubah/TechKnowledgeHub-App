package com.example.techknowledgehub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.techcontent)

        val content1 = findViewById<CardView>(R.id.content1)
        val content2 = findViewById<CardView>(R.id.content2)
        val content3 = findViewById<CardView>(R.id.content3)
        val content4 = findViewById<CardView>(R.id.content4)

        val bundle: Bundle? = intent.extras
        val resId: Int = bundle!!.getInt("resId")
        val figma: Int = bundle!!.getInt("figma")
        val firebase: Int = bundle!!.getInt("firebase")
        val aws: Int = bundle!!.getInt("aws")

        content1.foreground = getDrawable(resId)
        content2.foreground = getDrawable(figma)
        content3.foreground = getDrawable(firebase)
        content4.foreground = getDrawable(aws)





        }
    }



