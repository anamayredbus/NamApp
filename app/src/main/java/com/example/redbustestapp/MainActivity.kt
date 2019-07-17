package com.example.redbustestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        this.but_num.setOnClickListener {

          val foj : Int = show()

            val tex = findViewById<TextView>(R.id.texf)
            tex.setText(foj.toString())

            var foh : String = foj.toString()

        val fgr = Intent(this,Main2Activity::class.java)

            fgr.putExtra("hello" , foh)

        startActivity(fgr)
        }


    }

   fun show() : Int {
       val dog = findViewById<EditText>(R.id.editText)
       val kol = findViewById<EditText>(R.id.editText1)

       val gog :Int = dog.text.toString().toInt()
       val fol : Int = kol.text.toString().toInt()
       val sum : Int = gog + fol

      return sum

   }


}
