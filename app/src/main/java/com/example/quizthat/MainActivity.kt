package com.example.quizthat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.configureButtons()
    }

    private fun configureButtons() {
        val playButton: Button = findViewById<Button>(R.id.playButton)
        playButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,PreGameActivity::class.java)
            startActivity(intent)
        }
    }
}