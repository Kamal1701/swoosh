package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding :  ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
//        setContentView(R.layout.activity_main)
        setContentView(view)
        binding.getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}