package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.databinding.ActivityLeagueBinding
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {
    private lateinit var binding: ActivityLeagueBinding
    var selectedLeague = ""
    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        val viewLeague = binding.root
//        setContentView(R.layout.activity_league)
        setContentView(viewLeague)


//        binding.toggleBtnMens.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked) {
//                binding.toggleBtnMens.setBackgroundResource(R.drawable.swoosh_button_checked)
//            } else {
//                binding.toggleBtnMens.setBackgroundResource(R.drawable.swoosh_button)
//            }
//        }
//
//        binding.toggleBtnWomens.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked) {
//                binding.toggleBtnWomens.setBackgroundResource(R.drawable.swoosh_button_checked)
//            } else {
//                binding.toggleBtnWomens.setBackgroundResource(R.drawable.swoosh_button)
//            }
//        }
//
//        binding.toggleBtnCoEd.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked) {
//                binding.toggleBtnCoEd.setBackgroundResource(R.drawable.swoosh_button_checked)
//            } else {
//                binding.toggleBtnCoEd.setBackgroundResource(R.drawable.swoosh_button)
//            }
//        }

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun onMensClicked(view: View) {
        binding.toggleBtnWomens.isChecked = false
        binding.toggleBtnCoEd.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        binding.toggleBtnMens.isChecked = false
        binding.toggleBtnCoEd.isChecked = false
        player.league = "womens"
    }

    fun onCoEdClicked(view: View) {
        binding.toggleBtnMens.isChecked = false
        binding.toggleBtnWomens.isChecked = false
        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if(player.league !=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else{
            Toast.makeText(this, "Please select a league",Toast.LENGTH_SHORT).show()
        }
    }
}
