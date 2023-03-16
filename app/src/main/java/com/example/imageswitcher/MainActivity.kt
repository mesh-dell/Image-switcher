package com.example.imageswitcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

lateinit var btnNext: Button
lateinit var btnPrev: Button
lateinit var imageView: ImageView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i = "img"
        var j : Int
        btnNext = findViewById(R.id.btnNext)
        btnPrev = findViewById(R.id.btnPrev)
        imageView = findViewById(R.id.imageView)

    }
}