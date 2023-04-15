package com.example.bmicalculater1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_women_page.*

class WomenPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_women_page)

        male.setOnClickListener{
            val intent = Intent(this@WomenPage,MenPage::class.java)
            startActivity(intent)
        }
         account.setOnClickListener{
         val intent = Intent(this@WomenPage,Account::class.java)
         startActivity(intent)
         }

        BtnSub.setOnClickListener {
            if (!weight.toString().equals("") && !height.toString().equals("")) {
                val weights = weight.text.toString().toInt()
                val heit = height.text.toString().toInt()
                val heit1 = heit / 100;
                val heit2 = heit1 * heit1;
                val total = weights / heit2;
                textView2.text = "Your BMI is ${total.inc()}"
            } else {
                Toast.makeText(this@WomenPage, "Please Enter Required Values", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}