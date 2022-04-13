package com.hamroyevazizjon.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.hamroyevazizjon.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var animation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.zoom.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.zoom)
            binding.img.startAnimation(animation)
        }

        binding.blink.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.blink)
            binding.img.startAnimation(animation)
        }

        binding.clockwise.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.clockwise)
            binding.img.startAnimation(animation)
        }

        binding.fade.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.fade)
            binding.img.startAnimation(animation)
        }

        binding.slide.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.slide)
            binding.img.startAnimation(animation)
        }

        binding.move.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.move)
            binding.img.startAnimation(animation)
        }

    }
}