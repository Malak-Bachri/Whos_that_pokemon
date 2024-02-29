package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NextPokemon4Reveal : AppCompatActivity() {
    private var score: Int = 0
    private lateinit var scoreTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_pokemon4_reveal)

        score = intent.getIntExtra("SCORE_EXTRA", 0)

        scoreTextView = findViewById(R.id.score_number)
        scoreTextView.text = score.toString()


        val score = intent.getIntExtra("SCORE_EXTRA", 0)
        val scoreTextView: TextView = findViewById(R.id.score_number)
        scoreTextView.text = score.toString()
    }
}
