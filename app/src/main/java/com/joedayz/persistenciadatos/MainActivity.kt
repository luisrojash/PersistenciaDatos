package com.joedayz.persistenciadatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usuario = intent.extras?.getString("usuario")
        val clave = intent.extras?.getString("clave")
        textViewUsuario.text = "Bienvenido al sistema " + usuario
        textViewClave.text = "Su clave es " + clave
    }

}