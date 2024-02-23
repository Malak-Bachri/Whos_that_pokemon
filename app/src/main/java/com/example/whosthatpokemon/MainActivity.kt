package com.example.whosthatpokemon


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup


class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup // Declare radioGroup variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)

        addRadioButtonsToGroup()

        val submitButton: Button = findViewById(R.id.submit_button)
        submitButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ResultActivity1::class.java)
            startActivity(intent)
        }
    }

    private fun addRadioButtonsToGroup() {
        val radioButtonIds = arrayOf(R.id.pikachu, R.id.dragonite, R.id.charizard, R.id.meowth)

        for (radioButtonId in radioButtonIds)
        {
            val radioButton = findViewById<RadioButton>(radioButtonId)
            val parent = radioButton.parent as? ViewGroup
            parent?.removeView(radioButton)
            radioGroup.addView(radioButton)
        }


        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            for (radioButtonId in radioButtonIds)
            {
                val radioButton = findViewById<RadioButton>(radioButtonId)
                if (radioButton.id != checkedId)
                {
                    radioButton.isChecked = false
                }
            }
        }
    }
}
