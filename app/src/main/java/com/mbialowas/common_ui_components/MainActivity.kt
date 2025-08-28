package com.mbialowas.common_ui_components

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var et_input: EditText
    private lateinit var btn_input: Button
    private lateinit var cb_input: CheckBox
    private lateinit var rg_input: RadioGroup
    private lateinit var switch: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        et_input = findViewById<EditText>(R.id.et_input)
        btn_input = findViewById<Button>(R.id.btn_input)
        btn_input.setOnClickListener {
            val enteredText = et_input.text.toString()
            Log.d("MJB",enteredText)
            Toast.makeText(this,"You clicked the button, the input was $enteredText", Toast.LENGTH_LONG).show()
        }

    }
}