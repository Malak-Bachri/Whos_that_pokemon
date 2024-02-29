package com.example.whosthatpokemon

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextPokemon3 : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var scoreTextView: TextView
    private lateinit var scoreNumberTextView: TextView
    private var score: Int = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_pokemon3)



        radioGroup = findViewById(R.id.radioGroup)
        scoreTextView = findViewById(R.id.scoreTextView)
        scoreNumberTextView = findViewById(R.id.score_number)

        scoreNumberTextView.text = intent.getIntExtra("SCORE_EXTRA", 0).toString()

        addRadioButtonsToGroup()

        val submitButton: Button = findViewById<Button>(R.id.submit_button)
        submitButton.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            val correctAnswerId = R.id.charizard

            if (selectedRadioButtonId == correctAnswerId) {
                score++
                updateScore()
            }

            val intent = Intent(this@NextPokemon3, NextPokemon3Reveal::class.java)
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
