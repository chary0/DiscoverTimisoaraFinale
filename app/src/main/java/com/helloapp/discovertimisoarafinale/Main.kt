package com.helloapp.discovertimisoarafinale

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity

class Main : AppCompatActivity() {

    lateinit var floatingActionButton : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        floatingActionButton = findViewById(R.id.floating_button)
        floatingActionButton.setOnClickListener{
            onclick()
        }
    }


    fun onclick() {
        var intent = Intent(this,Main2Activity::class.java)
        startActivity(intent)

    }
}
