package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    // The final score
    var score = finalScore
}