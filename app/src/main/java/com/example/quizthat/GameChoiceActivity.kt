package com.example.quizthat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class GameChoiceActivity : AppCompatActivity() {

    lateinit var tvPlayerName: TextView
    lateinit var tvPlayerScore: TextView
    lateinit var llGameChoice: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_choice)

        this.tvPlayerName = findViewById(R.id.tvGameChoicePlayerName)
        this.tvPlayerScore = findViewById(R.id.tvGameChoicePlayerScore)
        this.llGameChoice = findViewById(R.id.llGameChoice)

        this.tvPlayerName.text = GameState.currentPlayer.name
        this.tvPlayerName.setBackgroundColor(GameState.currentPlayer.color.toArgb())
        this.tvPlayerScore.text = GameState.currentPlayer.score.toString()
        this.tvPlayerScore.setBackgroundColor(GameState.currentPlayer.color.toArgb())
    }


}