package com.example.codeeditor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class code_activity : AppCompatActivity() {
    lateinit var web_browser:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)


        web_browser=findViewById(R.id.web_browser)

        web_browser.loadData(intent.getStringExtra("code"),"text/html; charset=utf-8",null)
    }
}
