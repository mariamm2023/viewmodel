package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class scoreviewmodel:ViewModel() {
   private var score1one=0
    val score1: Int get() = score1one
    private var scoretwo=0

    val score2: Int get() = scoretwo

    fun incresescoreteamone(){
        score1one++
    }
    fun incresescoreteamtwo(){
        scoretwo++
    }

}