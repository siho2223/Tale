package com.talebrawlmod.fake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.talebrawlmod.fake.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val features = listOf(
        "Auto Aim (X-Ray)",
        "Auto Super",
        "No Grass (Clear Bushes)",
        "Auto Reload",
        "Anti AFK",
        "Fast Matchmaking (Fake)",
        "Bot Lobby (Visual)",
        "FPS Booster (UI Only)",
        "Ping Stabilizer (UI Only)"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuTitle.text = "Tale Brawl Mod Menu"

        val adapter = FeatureAdapter(features)
        binding.featureList.adapter = adapter
    }
}