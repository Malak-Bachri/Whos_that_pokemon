package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NextPokemon2 : AppCompatActivity() {

    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_pokemon2)

        val next_pokemon_button: Button = findViewById(R.id.next_pokemon_charizard)
        next_pokemon_button.setOnClickListener {
            val intent = Intent(this@NextPokemon2, NextPokemon3::class.java)
            intent.putExtra("SCORE_EXTRA", score)
            startActivity(intent)
        }

        score = intent.getIntExtra("SCORE_EXTRA", 0)
        val scoreTextView: TextView = findViewById(R.id.score_number)
        scoreTextView.text = score.toString()
    }
}
