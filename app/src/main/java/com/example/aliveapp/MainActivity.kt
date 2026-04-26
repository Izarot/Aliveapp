package com.example.aliveapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "AliveApp Lives 🎉"
        text.textSize = 28f

        setContentView(text)
    }
}