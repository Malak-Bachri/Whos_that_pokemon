package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var scoreTextView: TextView
    private lateinit var scoreNumberTextView: TextView
    private var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)
        scoreTextView = findViewById(R.id.scoreTextView)
        scoreNumberTextView = findViewById(R.id.score_number)

        addRadioButtonsToGroup()

        val submitButton: Button = findViewById(R.id.submit_button)
        submitButton.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            val correctAnswerId = R.id.dragonite

            if (selectedRadioButtonId == correctAnswerId) {
                score++
                updateScore()
            }

            val intent = Intent(this@MainActivity, ResultActivity1::class.java)
            intent.putExtra("SCORE_EXTRA", score)
            startActivity(intent)

        }
    }
    private fun updateScore() {
        scoreNumberTextView.text = score.toString()
    }

    private fun addRadioButtonsToGroup() {
        val radioButtonIds = arrayOf(R.id.pikachu, R.id.dragonite, R.id.charizard, R.id.meowth)

        for (radioButtonId in radioButtonIds) {
            val radioButton = findViewById<RadioButton>(radioButtonId)
            val parent = radioButton.parent as? ViewGroup
            parent?.removeView(radioButton)
            radioGroup.addView(radioButton)
        }

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            for (radioButtonId in radioButtonIds) {
                val radioButton = findViewById<RadioButton>(radioButtonId)
                radioButton.isChecked = radioButton.id == checkedId
            }
        }
    }

}
