package com.example.quizthat

import android.app.ActionBar
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import android.widget.LinearLayout
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.marginStart
import androidx.core.view.marginTop
import androidx.recyclerview.widget.RecyclerView
import com.github.dhaval2404.colorpicker.MaterialColorPickerDialog
import com.github.dhaval2404.colorpicker.model.ColorShape

// https://www.raywenderlich.com/1560485-android-recyclerview-tutorial-with-kotlin
// https://guides.codepath.com/android/using-the-recyclerview
class PreGameActivity : AppCompatActivity() {

    lateinit var btnAddPlayer: Button
    lateinit var btnColorPicker: Button
    lateinit var btnStartGame: Button
    lateinit var inputPlayerName: EditText
    lateinit var llPlayers: LinearLayout

    var currentColor: Color = Color.valueOf(1.0f, 0.5f, 0.5f)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_game)

        this.btnAddPlayer = findViewById(R.id.buttonAddPlayer)
        this.btnColorPicker = findViewById(R.id.btnColorPicker)
        this.btnStartGame = findViewById(R.id.btnStartGame)

        this.inputPlayerName = findViewById(R.id.inputPlayerName)
        this.llPlayers = findViewById(R.id.llPlayers)

        this.btnAddPlayer.setOnClickListener { this@PreGameActivity.onAddPlayer() }
        this.btnStartGame.setOnClickListener { this@PreGameActivity.onStartGame() }
        this.btnColorPicker.setOnClickListener {
            MaterialColorPickerDialog
                .Builder(this)
                .setTitle("Spielerfarbe wählen")
                .setColorShape(ColorShape.SQAURE)
                .setDefaultColor(this@PreGameActivity.currentColor.toString())
                .setColorListener {color, colorHex -> this@PreGameActivity.pickColor(color, colorHex)}
                .show()
        }

        GameState.onAddPlayer = { player -> this.addPlayerToPlayerList(player) }
    }

    fun onAddPlayer() {
        // Get the string player name
        val playerName: String = this.inputPlayerName.text.toString()

        // Actually add the player to the GameState
        val player: Player = Player(playerName, 0, this.currentColor)
        GameState.addPlayer(player)
    }

    fun onStartGame() {
        GameState.firstPlayer()

        val intent = Intent(this, GameChoiceActivity::class.java)
        startActivity(intent)
    }

    fun pickColor(color: Int, colorHex: String) {
        this.currentColor = Color.valueOf(color)
        this.btnColorPicker.setBackgroundColor(this.currentColor.toArgb())
    }

    fun addPlayerToPlayerList(player: Player) {

        var tvPlayer: TextView = TextView(this)
        tvPlayer.text = player.name
        tvPlayer.setBackgroundColor(player.color.toArgb())
        tvPlayer.setPadding(20, 20, 20, 20)
        tvPlayer.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18F)
        tvPlayer.setTypeface(null, Typeface.BOLD)
        tvPlayer.setTextColor(Color.BLACK)

        // https://stackoverflow.com/questions/45411634/set-runtime-margin-to-any-view-using-kotlin
        val param = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        param.setMargins(0, 20, 0, 0)
        tvPlayer.layoutParams = param

        this.llPlayers.addView(tvPlayer)
    }
}