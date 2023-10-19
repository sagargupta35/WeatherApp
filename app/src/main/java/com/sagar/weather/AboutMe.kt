package com.sagar.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutMe : AppCompatActivity() {
    private lateinit var previous: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        previous = findViewById(R.id.previous)
        previous.setOnClickListener() {startActivity(Intent(this, MainActivity::class.java))}

    }
}