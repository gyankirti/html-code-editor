package com.example.codeeditor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var  user_code:AutoCompleteTextView
    lateinit var run_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        user_code = findViewById(R.id.user_code)
        run_btn = findViewById(R.id.run_btn)


        run_btn.setOnClickListener {

            Run()


        }

    }

    private fun Run(){

        val intent = Intent(this@MainActivity,code_activity::class.java)
        intent.putExtra("code",user_code.text.toString())
        startActivity(intent)
    }



}
