package com.joedayz.persistenciadatos

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonIngresar.setOnClickListener {
            val usuario = editTextUsuario.text.toString()
            val clave = editTextClave.text.toString()
            Log.i("LoginActivity", "usuario : " + usuario + "  - clave : " + clave)
            val iniciarMainActivity = Intent(this, MainActivity::class.java)
            iniciarMainActivity.putExtra("usuario", usuario)
            iniciarMainActivity.putExtra("clave", clave)
            startActivity(iniciarMainActivity)
        }


    }
}