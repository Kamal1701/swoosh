package com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.databinding.ActivityFinishBinding
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER


class FinishActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinishBinding
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_finish)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
        binding.searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}