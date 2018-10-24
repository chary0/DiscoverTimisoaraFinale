package com.helloapp.discovertimisoarafinale

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    public fun onclick(view:View){
        var intent = Intent(this,Main2Activity::class.java)
        startActivity(intent)

    }
}
