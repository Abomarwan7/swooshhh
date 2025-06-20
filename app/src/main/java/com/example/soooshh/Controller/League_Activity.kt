package com.example.soooshh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import com.example.soooshh.Model.Player
import com.example.soooshh.Utilities.EXTRA_PLAYER
import com.example.soooshh.databinding.ActivityLeagueBinding

class League_Activity : BaseActivity() {
    private lateinit var binding: ActivityLeagueBinding


    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

            player= savedInstanceState.getParcelable(EXTRA_PLAYER) ?: Player("","")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()






    }
    fun onMensClicked(view: View){
    binding.womensBt.isChecked = false
        binding.coBt.isChecked = false
        player.league = "Mens"
    }

    fun onWomensClicked(view: View){
    binding.mensBt.isChecked = false
        binding.coBt.isChecked = false
        player.league = "Womens"
    }

    fun onCoClicked(view: View){
    binding.mensBt.isChecked = false
    binding.womensBt.isChecked = false
        player.league = "Co-ed"
    }

    fun leageNextClicked(view: View){
        if (player.league != ""){
        val skillActivity = Intent(this, skillActivity::class.java)

            skillActivity.putExtra(EXTRA_PLAYER,player)

        startActivity(skillActivity)
        }else{
            Toast.makeText(this, "please select a league ",Toast.LENGTH_SHORT).show()
        }
    }


}