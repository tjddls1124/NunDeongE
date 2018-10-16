package com.example.tjddl.nundeonge

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable {
            val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
            finish()
        },2000)

        //TODO :  add animation
    }
}
