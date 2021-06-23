package com.nikhil.anand.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    /*
    *   lateinit keyword allows us to declare variables withoud assigning
    *   then anything. It basically tells the compiler that this variable
    *   will be assigned before calling it.
     */
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)

        // Handling the button click event
        rollButton.setOnClickListener({
            rollDice()
        })
    }

    /*
    *   This function implements a random method to find out a random
    *   integer between 1 to 6. Depending upon the random integer generated
    *   we are showing the appropriate images.
     */
    private fun rollDice() {
        val randoInt : Int = Random().nextInt(6)+1

        val drawableResource = when(randoInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}