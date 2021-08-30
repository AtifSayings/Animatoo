package com.blogspot.atifsoftwares.animatoo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.animatoo.databinding.ActivityMainBinding
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.animateCard.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateCard(this)
        }
        binding.animateDiagonal.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateDiagonal(this)
        }
        binding.animateFade.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateFade(this)
        }
        binding.animateInAndOut.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateInAndOut(this)
        }
        binding.animateShrink.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateShrink(this)
        }
        binding.animateSlideDown.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateSlideDown(this)
        }
        binding.animateSlideLeft.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateSlideLeft(this)
        }
        binding.animateSlideRight.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateSlideRight(this)
        }
        binding.animateSlideUp.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateSlideUp(this)
        }
        binding.animateSlideUp.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateSlideUp(this)
        }
        binding.animateSpin.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateSpin(this)
        }
        binding.animateSplit.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateSplit(this)
        }
        binding.animateSwipeLeft.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateSwipeLeft(this)
        }
        binding.animateSwipeRight.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateSwipeRight(this)
        }
        binding.animateWindmill.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateWindmill(this)
        }
        binding.animateZoom.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Animatoo.animateZoom(this)
        }

    }

}