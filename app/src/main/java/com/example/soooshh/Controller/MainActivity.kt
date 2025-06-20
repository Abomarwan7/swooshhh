package com.example.soooshh.Controller

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import com.example.soooshh.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        binding.getStartedBt.setOnClickListener{
            val leagueIntent = Intent(this, League_Activity::class.java)
            startActivity(leagueIntent)
        }

    }

}