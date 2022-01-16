package com.example.galeriazdj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.butn_dal).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.domek)



            }


        findViewById<Button>(R.id.butn_cof).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.kotek)
        }






    }
}