package com.example.a24112021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.a24112021.R.id

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btnlakers).setOnClickListener(){
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.lakers)
        }
        findViewById<Button>(R.id.btngrizzlies).setOnClickListener(){
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.grizzlies)
        }
        findViewById<Button>(R.id.btnnets).setOnClickListener(){
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.nets)
        }
        findViewById<Button>(R.id.btnmavericks).setOnClickListener(){
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.mavericks)
        }
    }
}