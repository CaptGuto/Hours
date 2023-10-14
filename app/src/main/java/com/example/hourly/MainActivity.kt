package com.example.hourly

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(isFirstTime()){
            var intent = Intent(this, StartUp::class.java)
            startActivity(intent)
        }
        else{
            var intent = Intent(this, MainPage::class.java)
            startActivity(intent)
        }

    }

    fun isFirstTime():Boolean{
        val sharedPreferences = getSharedPreferences("FirstTime", Context.MODE_PRIVATE)

        return sharedPreferences.getBoolean("isfirst", true)
    }
}