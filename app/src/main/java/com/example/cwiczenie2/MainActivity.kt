package com.example.cwiczenie2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Zmien).setOnClickListener {
          //  findViewById<EditText>(R.id.editTextTextMultiLine).setText(R.string."Kacper Piatkowski")
        }
    }
}