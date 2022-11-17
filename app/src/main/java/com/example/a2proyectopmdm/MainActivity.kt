package com.example.a2proyectopmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class MainActivity : AppCompatActivity() {
    private var onCreate=0
    private var onStart=0
    private var onResume=0
    private var onPause=0
    private var onStop=0
    private var onDestroy=0
    private var onRestart=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")
    }
    override fun onStart() {
        super.onStart()
        println("onStart $onStart")
    }
    override fun onResume() {
        super.onResume()
        println("onResume $onResume")
    }
    override fun onPause() {
        super.onPause()
        println("onPause $onPause")
    }
    override fun onStop() {
        super.onStop()
        println("onStop $onStop")
    }
    override fun  onDestroy() {
        super. onDestroy()
        println("onDestroy $onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        println("onRestart $onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

}
