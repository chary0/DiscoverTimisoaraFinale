package com.helloapp.discovertimisoarafinale

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var id = intent.getIntExtra("id",0)
    }
}