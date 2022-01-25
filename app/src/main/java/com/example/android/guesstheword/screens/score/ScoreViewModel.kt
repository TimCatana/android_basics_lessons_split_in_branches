package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController

class ScoreViewModel(finalScore: Int): ViewModel() {

    // The current word
    val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    // The current word
    val _playAgain = MutableLiveData<Boolean>()
    val playAgain: LiveData<Boolean>
        get() = _playAgain


    init {
        _score.value = finalScore
        _playAgain.value = false
        Log.i("ScoreViewModel", "Final score is ${finalScore}")
    }

    fun onPlayAgain() {
        _playAgain.value = true
    }

    fun onPlayAgainClicked() {
        _playAgain.value = false
    }





}