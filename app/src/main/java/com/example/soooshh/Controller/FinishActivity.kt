package com.example.soooshh.Controller

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.soooshh.Model.Player
import com.example.soooshh.R
import com.example.soooshh.Utilities.EXTRA_PLAYER
import com.example.soooshh.databinding.ActivityFinishBinding
import com.example.soooshh.databinding.ActivitySkillBinding

class FinishActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        binding.searchLeagueText.text="Looking for ${player?.league} ${player?.skills} league near you ..."
    }
}