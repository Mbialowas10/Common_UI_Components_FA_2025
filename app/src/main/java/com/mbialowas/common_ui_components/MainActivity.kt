package com.mbialowas.common_ui_components

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ListView
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.Spinner

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
    private lateinit var spinner: Spinner
    private lateinit var listview: ListView
    private lateinit var seekBar: SeekBar
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
        spinner = findViewById<Spinner>(R.id.spinner)
        listview = findViewById<ListView>(R.id.listView)
        seekBar = findViewById<SeekBar>(R.id.seekBar)

        btn_input.setOnClickListener {
            val enteredText = et_input.text.toString()
            Log.d("MJB",enteredText)
            Toast.makeText(this,"You clicked the button, the input was $enteredText", Toast.LENGTH_LONG).show()
        }

        // spinner setup
        val spinnerItems = arrayOf("Red", "Green", "Blue")
        spinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, spinnerItems)

        // listView
        val listItems = arrayOf("Item A", "Item B", "Item C", "Item D")
        listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)

        // seekbar change listener
        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(
                p0: SeekBar?,
                p1: Int,
                p2: Boolean
            ) {
                TODO("Not yet implemented")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

        })
    }
}