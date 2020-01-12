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

        buttonReset.setOnClickListener{
            spinnerAge.setSelection(0)
            radioGroupGender.clearCheck()
            checkBoxSmoker.isChecked = false
            textViewPremium.text = "Insurance Premium:"
        }
    }

    fun calculate() {
        val age = spinnerAge.selectedItemPosition.toString().toInt()
        val male = radioButtonMale.isChecked


        val smoker = checkBoxSmoker.isChecked
        var insurance = 0

        when (age) {
            0 -> {
                insurance = 60
            }
            1 -> {
                insurance = 70
                if (male)
                    insurance += 50
                if (smoker)
                    insurance += 100
            }
            2 -> {
                insurance = 90
                if (male)
                    insurance += 100
                if (smoker)
                    insurance += 150
            }
            3 -> {
                insurance = 120
                if (male)
                    insurance += 150
                if (smoker)
                    insurance += 200
            }
            4 -> {
                insurance = 150
                if (male)
                    insurance += 200
                if (smoker)
                    insurance += 250
            }
            5 -> {
                insurance = 150
                if (male)
                    insurance += 200
                if (smoker)
                    insurance += 300
            }
        }
        textViewPremium.text = "Insurance Premium:" + insurance.toString()
    }


}
