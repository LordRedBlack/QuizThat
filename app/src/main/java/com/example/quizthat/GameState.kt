package com.example.quizthat

import android.widget.Toast

object GameState {

    var players: MutableList<Player> = mutableListOf()
    var currentPlayerIndex: Int = 0
    lateinit var currentPlayer: Player

    var onAddPlayer = { player: Player -> }

    fun addPlayer(player: Player) {
        this.players.add(player)
        this.onAddPlayer(player)
    }

    fun firstPlayer() {
        this.currentPlayerIndex = 0
        this.currentPlayer = this.players[this.currentPlayerIndex]
    }

    fun nextPlayer() {
        this.currentPlayerIndex += 1
        this.currentPlayer = this.players[this.currentPlayerIndex]
    }
}