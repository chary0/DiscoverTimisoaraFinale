package com.helloapp.discovertimisoarafinale

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        card_view.setOnClickListener {
        navigatetomain3()
        }
        card_view1.setOnClickListener {
        navigatetomain4()
        }
        card_view2.setOnClickListener {
            navigatetomain5()
        }
    }
    fun navigatetomain3(){
        var intent = Intent(this,Main3Activity::class.java)
        startActivity(intent)

    }
    fun navigatetomain4(){
        var intent = Intent(this,Main4Activity::class.java)
        startActivity(intent)

    }
    fun navigatetomain5(){
        var intent = Intent(this,Main5Activity::class.java)
        startActivity(intent)

    }
}
