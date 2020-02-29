package com.example.codelabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener { countUpDice() }
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }
    private fun countUpDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val cnt = Integer.parseInt(resultText.text.toString())
        if (cnt < 6) {
            resultText.text = (cnt + 1).toString()
        }
    }
    private fun resetDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
}
