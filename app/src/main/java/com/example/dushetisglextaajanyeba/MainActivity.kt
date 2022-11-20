package com.example.dushetisglextaajanyeba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var first = findViewById<EditText>(R.id.FirstName)
        var second = findViewById<EditText>(R.id.SecondName)
        var button = findViewById<Button>(R.id.StartButton)
        button.setOnClickListener {
            val name1 = first.text.toString()
            val name2 = second.text.toString()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("Name1", name1)
            intent.putExtra("Name2", name2)
            startActivity(intent)
        }

    }
}