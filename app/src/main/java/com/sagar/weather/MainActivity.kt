package com.sagar.weather

import android.content.Intent
import android.opengl.Visibility
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import org.json.JSONObject
import org.w3c.dom.Text
import java.net.URL
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class MainActivity : AppCompatActivity() {

    private lateinit var aboutMe: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aboutMe = findViewById(R.id.about_me)
        aboutMe.setOnClickListener() {startActivity(Intent(this, AboutMe::class.java))}
    }

}