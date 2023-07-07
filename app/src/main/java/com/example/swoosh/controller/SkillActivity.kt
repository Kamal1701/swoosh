package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.databinding.ActivitySkillBinding
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {

    lateinit var player: Player
    private lateinit var binding: ActivitySkillBinding

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_skill)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        val viewSkill = binding.root
        setContentView(viewSkill)
        player = intent.getParcelableExtra(EXTRA_PLAYER )!!
//        println(league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState!=null)
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun onBeginnerClicked(view: View){
        binding.toggleBtnBaller.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked(view: View){
        binding.toggleBtnBeginner.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClicked(view: View){
        if(player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        } else{
            Toast.makeText(this, "Please select a skill set", Toast.LENGTH_SHORT).show()
        }
    }
}