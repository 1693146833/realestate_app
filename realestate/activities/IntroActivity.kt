package com.example.realestate.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realestate.R
import android.content.Intent
import android.view.View
import android.widget.Button

class IntroActivity : AppCompatActivity() {
    private lateinit var startBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        startBtn = findViewById(R.id.startBtn)
        startBtn.setOnClickListener {
            startActivity(Intent(this@IntroActivity, MainActivity::class.java))
        }
    }
}