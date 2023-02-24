package com.johnbosco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.johnbosco.mylogin.R

class MainActivityhome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityhome)
        val con = findViewById<Button>(R.id.con)

        con.setOnClickListener {
            val con =Intent(this,home::class.java)
            startActivity(con)
        }
        }
    }
