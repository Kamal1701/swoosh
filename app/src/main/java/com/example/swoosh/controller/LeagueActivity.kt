package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.databinding.ActivityLeagueBinding

class LeagueActivity : BaseActivity() {
    private lateinit var binding: ActivityLeagueBinding
    var selectedLeague = ""
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

    fun onMensClicked(view: View) {
        binding.toggleBtnWomens.isChecked = false
        binding.toggleBtnCoEd.isChecked = false
        selectedLeague = "Mens"
    }

    fun onWomensClicked(view: View) {
        binding.toggleBtnMens.isChecked = false
        binding.toggleBtnCoEd.isChecked = false
        selectedLeague = "Womens"
    }

    fun onCoEdClicked(view: View) {
        binding.toggleBtnMens.isChecked = false
        binding.toggleBtnWomens.isChecked = false
        selectedLeague = "Co-ed"
    }

    fun leagueNextClicked(view: View) {
        if(selectedLeague !=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        } else{
            Toast.makeText(this, "Please select a league",Toast.LENGTH_SHORT).show()
        }

    }
}
