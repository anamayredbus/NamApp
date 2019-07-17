package com.example.redbustestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bun:Bundle?

        bun = intent.extras

        val co:String? = bun?.getString("hello")

        val tex = findViewById<TextView>(R.id.textl)

        tex.setText(co)


    }
}
