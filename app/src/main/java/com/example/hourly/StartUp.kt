package com.example.hourly

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StartUp : AppCompatActivity() {

    lateinit var wellcomTextView:TextView
    lateinit var BeginBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_up)

        wellcomTextView = findViewById(R.id.tvWellcomeView)
        wellcomTextView.text = getString(R.string.wellcom)

        BeginBtn = findViewById(R.id.btnStart)

        BeginBtn.setOnClickListener{
            changeStartStutus()

        }

    }

    fun changeStartStutus(){
        val sharedPreferences = getSharedPreferences("FirstTime", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        editor.putBoolean("isfirst", false)
        editor.apply()
    }
}