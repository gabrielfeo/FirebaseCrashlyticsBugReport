package com.gabrielfeo.template.bugreport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        throw RuntimeException("I crash during Activity.onCreate, but I'm not logged at all")
    }
}