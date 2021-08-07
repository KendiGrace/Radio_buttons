package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var btnOrder:Button
    lateinit var rgMeat:RadioGroup
    lateinit var cbCheese:CheckBox
    lateinit var cbSalad:CheckBox
    lateinit var cbOnions:CheckBox
    lateinit var tvOrder:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        github/com/owuor91/codehive
      btnOrder.setOnClickListener {
          val checkedMeatRadioButtonId =rgMeat.checkedRadioButtonId
          val meat=findViewById<RadioButton>(checkedMeatRadioButtonId)
          val cheese=cbCheese.isChecked
          val salad=cbSalad.isChecked
          val onions=cbOnions.isChecked

          val orderString="You have ordered a burger with : \n" +
                  "${meat.text}" +
                  (if(cheese) "\n cheese" else "") +
                  (if(onions) "\n onions" else "") +
                  (if(salad)"\n onions" else "")

          tvOrder.text=orderString

      }

    }
}