package com.desafiolatam.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val _player1Points = MutableStateFlow(10)
    private val _player2Points = MutableStateFlow(10)

    val player1Points: StateFlow<Int> = _player1Points
    val player2Points: StateFlow<Int> = _player2Points

    fun incrementPlayer1Points() {
        if (_player1Points.value < 20) {
            _player1Points.value += 1
            _player2Points.value -= 1
        }
    }

    fun incrementPlayer2Points() {
        if (_player2Points.value < 20) {
            _player2Points.value += 1
            _player1Points.value -= 1
        }
    }
}
