package com.example.a2proyectopmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var onCreate=0
    private var onStart=0
    private var onResume=0
    private var onPause=0
    private var onStop=0
    private var onDestroy=0
    private var onRestart=0
    var t: String? = null
    var texto: EditText? = null
    var texto1: EditText? = null

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

    override fun onSaveInstanceState(guardaEstado: Bundle) {
        super.onSaveInstanceState(guardaEstado)
        //guardamos en la variable t el texto del campo EditText
        texto = findViewById (R.id.editTextTextPersonName);
        t = texto!!.text.toString()
        //lo "guardamos" en el Bundle
        guardaEstado.putString("text", t)
        //guardamos en la variable t el texto del campo EditText
        texto1 = findViewById (R.id.editTextTextPersonName2);
        t = texto1!!.text.toString()
        //lo "guardamos" en el Bundle
        guardaEstado.putString("text1", t)

    }

    override fun onRestoreInstanceState(recuperaEstado: Bundle) {
        super.onRestoreInstanceState(recuperaEstado)
        //recuperamos el String del Bundle
        t = recuperaEstado.getString("text")
        //Seteamos el valor del EditText con el valor de nuestra cadena
        texto!!.setText(t)
        //recuperamos el String del Bundle
        t = recuperaEstado.getString("text1")
        //Seteamos el valor del EditText con el valor de nuestra cadena
        texto1!!.setText(t)
    }

}
