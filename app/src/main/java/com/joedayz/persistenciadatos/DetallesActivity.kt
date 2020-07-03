package com.joedayz.persistenciadatos

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalles.*

class DetallesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)
        val conteo = intent.extras?.getInt("cuenta")
        Log.i("DetallesActivity", "" + conteo)

        textViewConteo.text = "Su conteo que ha pasado por el bundle es " + conteo

        buttonRegresar.setOnClickListener {
            finish()
        }
    }
}