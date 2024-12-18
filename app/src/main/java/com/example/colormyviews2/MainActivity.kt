package com.example.colormyviews2

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat
import com.example.colormyviews2.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()

    }

    private fun setListeners() {
        val clickableViews : List<View> = listOf(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.constraintLayout,
            binding.redButton,
            binding.greenButton,
            binding.yellowButton
        )
        for (item in clickableViews) {
            item.setOnClickListener{
                makeListeners(item)
            }
        }
    }

    private fun makeListeners(view : View) {
        when (view.id) {

            binding.boxOneText.id -> view.setBackgroundResource(R.color.oxford_blue)
            binding.boxTwoText.id -> view.setBackgroundResource(R.color.space_cadet)
            binding.boxThreeText.id -> view.setBackgroundResource(R.color.silver_pink)
            binding.boxFourText.id -> view.setBackgroundResource(R.color.taupe_gray)
            binding.boxFiveText.id -> view.setBackgroundResource( R.color.silver)

            binding.redButton.id -> binding.boxThreeText.setBackgroundResource( R.color.my_red)
            binding.greenButton.id -> binding.boxFourText.setBackgroundResource( R.color.my_green)
            binding.yellowButton.id -> binding.boxFiveText.setBackgroundResource( R.color.my_yellow)

            else -> view.setBackgroundResource(R.color.light_grayish_cyan)
        }
    }
}

