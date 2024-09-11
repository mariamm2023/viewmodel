package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: scoreviewmodel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(scoreviewmodel::class.java)
        setContentView(binding.root)
        updatescoreteamone()
        updatescoreteamtwo()
        binding.increaseScore1.setOnClickListener {
            viewModel.incresescoreteamone()
            updatescoreteamone()
        }
        binding.increaseScore2.setOnClickListener {
            viewModel.incresescoreteamtwo()
            updatescoreteamtwo()
        }
    }
    fun updatescoreteamone(){
        binding.team1score.text=viewModel.score1.toString()
    }
    fun updatescoreteamtwo(){
        binding.team2score.text=viewModel.score2.toString()
    }
}