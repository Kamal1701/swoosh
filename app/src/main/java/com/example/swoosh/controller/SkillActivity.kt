package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.databinding.ActivitySkillBinding
import com.example.swoosh.utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""
    private lateinit var binding: ActivitySkillBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_skill)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        val viewSkill = binding.root
        setContentView(viewSkill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }

    fun onBeginnerClicked(view: View){
        binding.toggleBtnBaller.isChecked = false
        skill = "Beginner"
    }

    fun onBallerClicked(view: View){
        binding.toggleBtnBeginner.isChecked = false
        skill = "Baller"
    }

    fun onFinishClicked(view: View){
        if(skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else{
            Toast.makeText(this, "Please select a skill set", Toast.LENGTH_SHORT).show()
        }

    }
}