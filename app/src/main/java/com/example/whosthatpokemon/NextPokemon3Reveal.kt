package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NextPokemon3Reveal : AppCompatActivity() {

    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_pokemon3_reveal)

        val next_pokemon_button: Button = findViewById(R.id.next_pokemon_charizard)
        next_pokemon_button.setOnClickListener {
            val intent = Intent(this@NextPokemon3Reveal, NextPokemon4::class.java)
            intent.putExtra("SCORE_EXTRA", score)
            startActivity(intent)
        }

        score = intent.getIntExtra("SCORE_EXTRA", 0)
        val scoreTextView: TextView = findViewById(R.id.score_number)
        scoreTextView.text = score.toString()
    }
}
