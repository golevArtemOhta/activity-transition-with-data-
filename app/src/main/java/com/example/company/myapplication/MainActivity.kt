package com.example.company.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et = findViewById<EditText>(R.id.editText)
        var btn = findViewById<Button>(R.id.button)
//передача данных по кнопке
        btn.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            i.putExtra("key", et.getText().toString())
            startActivity(i)
        }

    }
}
