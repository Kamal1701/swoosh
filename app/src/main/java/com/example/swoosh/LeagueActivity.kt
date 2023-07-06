package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import com.example.swoosh.databinding.ActivityLeagueBinding

class LeagueActivity : BaseActivity() {
    private lateinit var binding: ActivityLeagueBinding
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
    fun leagueNextClicked(view:View){
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)
    }
}
