package com.joedayz.persistenciadatos

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.joedayz.persistenciadatos.adapter.PersonaAdapter
import com.joedayz.persistenciadatos.adapter.model.Persona
import kotlinx.android.synthetic.main.activity_persona.*

class PersonaActividad : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persona)
        val list = arrayOf("Nombre", "asdasd", "asdasd", "asdsad")
        val adapter = PersonaAdapter(obtenerListaPersona())
        reciclador.layoutManager = GridLayoutManager(this, 2)
        reciclador.setHasFixedSize(true)
        reciclador.adapter = adapter
    }

    private fun obtenerListaPersona(): MutableList<Persona> {
        val mutableListPersona = mutableListOf<Persona>()
        mutableListPersona.add(
            Persona(
                "Luis",
                "Rojas",
                "963108545",
                "https://vignette.wikia.nocookie.net/dragonball/images/c/ca/Son_Goku_dise%C3%B1o_DBS_Broly.png/revision/latest?cb=20180831182644&path-prefix=es",
                R.drawable.ic_launcher_background
            )
        )
        mutableListPersona.add(
            Persona(
                "Jorge",
                "Rojas",
                "963108545",
                "data:image/jpeg;base64,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",
                R.drawable.ic_person
            )
        )
        mutableListPersona.add(
            Persona(
                "Luis",
                "Rojas",
                "963108545",
                "https://pasteboard.co/JeNaF9F.jpg",
                R.drawable.ic_launcher_foreground
            )
        )
        mutableListPersona.add(
            Persona(
                "Luis",
                "Rojas",
                "963108545",
                "https://pasteboard.co/JeNbSjA.png",
                R.drawable.ic_person
            )
        )
        mutableListPersona.add(
            Persona(
                "Luis",
                "Rojas",
                "963108545",
                "https://miro.medium.com/max/1400/1*f82fDTCyMUyRTePMC3xuCQ.png",
                R.drawable.ic_person
            )
        )
        return mutableListPersona
    }
}