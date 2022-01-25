package com.applicnation.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.applicnation.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            binding.boxOneTxt,
            binding.boxTwoTxt,
            binding.boxThreeTxt,
            binding.boxFourTxt,
            binding.boxFiveTxt,
            binding.redBtn,
            binding.yellowBtn,
            binding.greenBtn,
            binding.constraintLayout)

        for(item in clickableViews) {
            item.setOnClickListener {makeColored(it)}
        }
    }

   private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_txt -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_txt -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_txt -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_txt -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_txt -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_btn -> binding.boxThreeTxt.setBackgroundResource(R.color.my_red)
            R.id.yellow_btn -> binding.boxFourTxt.setBackgroundResource(R.color.my_yellow)
            R.id.green_btn -> binding.boxFiveTxt.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}