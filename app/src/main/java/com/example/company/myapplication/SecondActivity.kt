package com.example.company.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var tv = findViewById<TextView>(R.id.textView)

        val extras = intent.extras
        if (extras != null) {
            val value = extras.getString("key")
            tv.setText(value)
        }

    }
}
