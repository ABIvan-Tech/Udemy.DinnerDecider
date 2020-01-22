package com.example.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodlist = arrayListOf("Pelmeni", "Borsch", "Khinkali", "Baranki")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {
            val rand = Random()
            val randFood = rand.nextInt(foodlist.size)
            selectedFoodTxt.text = foodlist[randFood]
        }
        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodlist.add(newFood)
            addFoodTxt.text.clear()
            println(newFood)
            println(foodlist)
        }
    }
}
