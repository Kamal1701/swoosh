package com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.databinding.ActivityFinishBinding
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_finish)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)


        binding.searchLeagueText.text = "Looking for $league $skill league near you..."

    }
}