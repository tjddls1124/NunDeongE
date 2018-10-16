package com.example.tjddl.nundeonge

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.system.exitProcess

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClick(v :View){
        when(v.id){
            R.id.id_start ->{
                //TODO : connect unity
                val intent = Intent(this,Main3Activity::class.java)
                startActivity(intent)
                finish()
            }
            R.id.id_options ->{
                val intent = Intent(this,Main3Activity::class.java)
                startActivity(intent)
                //finish()
            }

            R.id.id_exit ->{
                exitProcess(1)
            }
        }
    }
}
