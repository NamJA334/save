package com.gachon.termproject

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var add_button: ImageButton
    private lateinit var calendar_button: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_button = findViewById(R.id.add)
        calendar_button=findViewById(R.id.calendar)

        //일기 추가 버튼
        add_button.setOnClickListener {
            val intent = Intent(this, DiaryActivity::class.java)
            startActivity(intent)
            finish()

        }
        calendar_button.setOnClickListener{
            val intent = Intent(this, calendar::class.java)
            startActivity(intent)
            finish()
        }


    }


}