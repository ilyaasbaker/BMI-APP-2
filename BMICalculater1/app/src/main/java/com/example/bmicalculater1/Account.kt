package com.example.bmicalculater1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*

class Account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        male.setOnClickListener{
            val intent = Intent(this@Account,MenPage::class.java)
            startActivity(intent)
        }
        female.setOnClickListener{
            val intent = Intent(this@Account,WomenPage::class.java)
            startActivity(intent)
        }
       // account.setOnClickListener{
           // val intent = Intent(this@Account,Account::class.java)
            //startActivity(intent)
       // }
    }
}