package com.example.dushetisglextaajanyeba

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity(),OnClickListener {
    private lateinit var button1:Button
    private lateinit var button2:Button
    private lateinit var button3:Button
    private lateinit var button4:Button
    private lateinit var button5:Button
    private lateinit var button6:Button
    private lateinit var button7:Button
    private lateinit var button8:Button
    private lateinit var button9:Button
    private lateinit var reset:Button
    private var angarish1 = 0
    private var angarish2 = 0
    private var player1 = ""
    private var player2 = ""
    private lateinit var shot1:TextView
    private lateinit var shot2:TextView
    private var activeplayer = 1
    private var firstPlayer = ArrayList<Int>()
    private var secondPlayer = ArrayList<Int>()
    private var a = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = getIntent()
        val name10 = intent.getStringExtra("Name1")
        val name20 = intent.getStringExtra("Name2")
        var names = findViewById<TextView>(R.id.Names1)
        var names0 = findViewById<TextView>(R.id.Names2)
        names.text = "$name10"
        names0.text = "$name20"
        player1 = name10.toString()
        player2 = name20.toString()
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        shot1 = findViewById<TextView>(R.id.shoti1)
        shot2 = findViewById<TextView>(R.id.shoti2)
        reset = findViewById<Button>(R.id.ResetButton)
        reset.isEnabled = false
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)

        reset.setOnClickListener {
            button1.text = ""
            button2.text = ""
            button3.text = ""
            button4.text = ""
            button5.text = ""
            button6.text = ""
            button7.text = ""
            button8.text = ""
            button9.text = ""
            button1.setBackgroundColor(Color.parseColor("#004D40"))
            button2.setBackgroundColor(Color.parseColor("#004D40"))
            button3.setBackgroundColor(Color.parseColor("#004D40"))
            button4.setBackgroundColor(Color.parseColor("#004D40"))
            button5.setBackgroundColor(Color.parseColor("#004D40"))
            button6.setBackgroundColor(Color.parseColor("#004D40"))
            button7.setBackgroundColor(Color.parseColor("#004D40"))
            button8.setBackgroundColor(Color.parseColor("#004D40"))
            button9.setBackgroundColor(Color.parseColor("#004D40"))
            button1.isEnabled = true
            button2.isEnabled = true
            button3.isEnabled = true
            button4.isEnabled = true
            button5.isEnabled = true
            button6.isEnabled = true
            button7.isEnabled = true
            button8.isEnabled = true
            button9.isEnabled = true
            firstPlayer.clear()
            secondPlayer.clear()
        }
    }
    override fun onClick(clickedView: View?) {
        if(clickedView is Button) {
            var buttonNumber = 0
            when (clickedView.id) {
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9
            }
            a = activeplayer
            playGame(buttonNumber,clickedView)
        }
    }

    private fun playGame(buttonNumber: Int, clickedView: Button) {
        if(activeplayer == 1){
            clickedView.text = "X"
            activeplayer = 2
            firstPlayer.add(buttonNumber)
            clickedView.setBackgroundColor(Color.RED)
        }else if(activeplayer == 2){
            clickedView.text = "O"
            activeplayer = 1
            secondPlayer.add(buttonNumber)
            clickedView.setBackgroundColor(Color.CYAN)
        }
        clickedView.isEnabled = false
        check()
    }

    private fun check() {
        var winner = 0
        if(firstPlayer.contains(1)&&firstPlayer.contains(2)&&firstPlayer.contains(3)){
            winner = 1
        }
        if(firstPlayer.contains(4)&&firstPlayer.contains(5)&&firstPlayer.contains(6)){
            winner = 1
        }
        if(firstPlayer.contains(7)&&firstPlayer.contains(8)&&firstPlayer.contains(9)){
            winner = 1
        }
        if(firstPlayer.contains(1)&&firstPlayer.contains(4)&&firstPlayer.contains(7)){
            winner = 1
        }
        if(firstPlayer.contains(2)&&firstPlayer.contains(5)&&firstPlayer.contains(8)){
            winner = 1
        }
        if(firstPlayer.contains(3)&&firstPlayer.contains(6)&&firstPlayer.contains(9)){
            winner = 1
        }
        if(firstPlayer.contains(1)&&firstPlayer.contains(5)&&firstPlayer.contains(9)){
            winner = 1
        }
        if(firstPlayer.contains(3)&&firstPlayer.contains(5)&&firstPlayer.contains(7)){
            winner = 1
        }
        if(secondPlayer.contains(1)&&secondPlayer.contains(2)&&secondPlayer.contains(3)){
            winner = 2
        }
        if(secondPlayer.contains(4)&&secondPlayer.contains(5)&&secondPlayer.contains(6)){
            winner = 2
        }
        if(secondPlayer.contains(7)&&secondPlayer.contains(8)&&secondPlayer.contains(9)){
            winner = 2
        }
        if(secondPlayer.contains(1)&&secondPlayer.contains(4)&&secondPlayer.contains(7)){
            winner = 2
        }
        if(secondPlayer.contains(2)&&secondPlayer.contains(5)&&secondPlayer.contains(8)){
            winner = 2
        }
        if(secondPlayer.contains(3)&&secondPlayer.contains(6)&&secondPlayer.contains(9)){
            winner = 2
        }
        if(secondPlayer.contains(1)&&secondPlayer.contains(5)&&secondPlayer.contains(9)){
            winner = 2
        }
        if(secondPlayer.contains(3)&&secondPlayer.contains(5)&&secondPlayer.contains(7)){
            winner = 2
        }
        if (winner == 1){
            Toast.makeText(this, "Congrats $player1", Toast.LENGTH_SHORT).show()
            angarish1 += 1
            activeplayer = 1
        }else if(winner == 2){
            Toast.makeText(this, "Congrats $player2", Toast.LENGTH_SHORT).show()
            angarish2 += 1
            activeplayer = 2
        }else if(firstPlayer.size + secondPlayer.size == 9){
            Toast.makeText(this, "YAIM YAIM GIYOMARIAT", Toast.LENGTH_SHORT).show()
            reset.isEnabled = true
            firstPlayer.clear()
            secondPlayer.clear()
            activeplayer = a
        }
        if(winner > 0){
            button1.isEnabled = false
            button2.isEnabled = false
            button3.isEnabled = false
            button4.isEnabled = false
            button5.isEnabled = false
            button6.isEnabled = false
            button7.isEnabled = false
            button8.isEnabled = false
            button9.isEnabled = false
            shot1.text = angarish1.toString()
            shot2.text = angarish2.toString()
            firstPlayer.clear()
            secondPlayer.clear()
            reset.isEnabled = true
        }
    }
}