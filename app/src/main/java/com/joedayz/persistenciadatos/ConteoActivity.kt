package com.joedayz.persistenciadatos

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_conteo.*


class ConteoActivity : AppCompatActivity() {

    var conteo = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conteo)

        Log.i("ConteoActivity", "onCreate")

        textViewConteo.text = "" + conteo

        buttonRestar.setOnClickListener {

            conteo = conteo - 1
            textViewConteo.text = "" + conteo
        }
        buttonSumar.setOnClickListener {

            conteo = conteo + 1
            textViewConteo.text = "" + conteo
        }
        buttonResetear.setOnClickListener {
            conteo = 0
            textViewConteo.text = "" + conteo
        }
        buttonDetalles.setOnClickListener {
            val iniciarDetalles = Intent(this, DetallesActivity::class.java)
            iniciarDetalles.putExtra("cuenta",conteo)
            startActivity(iniciarDetalles)
        }
    }

    override fun onSaveInstanceState(estado: Bundle) {
        Log.i("ConteoActivity", "onSaveInstanceState")
        //CLAVE - VALOR
        estado.putInt("cuenta", conteo)
        super.onSaveInstanceState(estado)
    }

    override fun onRestoreInstanceState(estado: Bundle) {
        super.onRestoreInstanceState(estado)
        Log.i("ConteoActivity", "onRestoreInstanceState")
        conteo = estado.getInt("cuenta")
        textViewConteo.text = "" + conteo
    }


    override fun onStart() {
        super.onStart()
        Log.i("ConteoActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ConteoActivity", "onResume")
        val datos = applicationContext.getSharedPreferences("MiConteo", 0)
        conteo = datos.getInt("cuenta", 0)

        //Log.i("ConteoActivity", nombre)
        //Toast.makeText(applicationContext, nombre, Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        val datos = applicationContext.getSharedPreferences("MiConteo", 0)
        val editor = datos.edit()
        editor.putInt("cuenta", conteo)
        editor.apply()
        Log.i("ConteoActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ConteoActivity", "onStop")
    }

    override fun onDestroy() {
        Log.i("ConteoActivity", "onDestroy")
        super.onDestroy()
    }
}