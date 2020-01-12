package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener{
            calculate()
        }
    }

    fun calculate() {
        val age = spinnerAge.selectedItemPosition.toString().toInt()
        val male = radioButtonMale.isChecked

        val smoker = checkBoxSmoker.isChecked
        var insurance = 0

        when (age) {
            1 -> {
                insurance += 60
            }
            2 -> {
                insurance = 70
                if (male)
                    insurance += 50
                if (smoker)
                    insurance += 100
            }
            3 -> {
                insurance = 90
                if (male)
                    insurance += 100
                if (smoker)
                    insurance += 150
            }
            4 -> {
                insurance = 120
                if (male)
                    insurance += 150
                if (smoker)
                    insurance += 200
            }
            5 -> {
                insurance = 150
                if (male)
                    insurance += 200
                if (smoker)
                    insurance += 250
            }
            6 -> {
                insurance = 150
                if (male)
                    insurance += 200
                if (smoker)
                    insurance += 300
            }
        }
    }
}
