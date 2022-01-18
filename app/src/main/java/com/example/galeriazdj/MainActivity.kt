package com.example.galeriazdj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var obraz = 1;
        findViewById<Button>(R.id.butn_cof).setOnClickListener {
            if(obraz == 1)
                obraz = 4;
            else
                obraz -= 1;
            if(obraz == 1 )
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.domek);
            else if(obraz == 2 )
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.auto);
            else if(obraz == 3 )
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.piesek);
            else if(obraz == 4 )
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.kotek);

        }






    }
}