package com.example.soooshh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import com.example.soooshh.Model.Player
import com.example.soooshh.R
import com.example.soooshh.Utilities.EXTRA_PLAYER
import com.example.soooshh.databinding.ActivitySkillBinding

class skillActivity : BaseActivity() {
    private lateinit var binding: ActivitySkillBinding
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySkillBinding.inflate(layoutInflater)
        setContentView(binding.root)




        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!



    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player= savedInstanceState.getParcelable(EXTRA_PLAYER) ?: Player("","")

    }

    fun onskillFinishClick(view: View){
        if (player.skills.isNotEmpty()){

        val finishActivity = Intent(this, FinishActivity::class.java)

            finishActivity.putExtra(EXTRA_PLAYER,player)


        startActivity(finishActivity)
        }else{
            Toast.makeText(this,"please choose a skill level",Toast.LENGTH_SHORT).show()
        }
    }
    fun onBeginnerClick(view: View){
        binding.ballerBt.isChecked=false
        player.skills="Beginner"
    }
    fun onBallerClick(view: View){
    binding.beginnerBt.isChecked=false
        player.skills="Baller"
    }
}