package com.joedayz.persistenciadatos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joedayz.persistenciadatos.R
import com.joedayz.persistenciadatos.adapter.holder.PersonaHolder
import com.joedayz.persistenciadatos.adapter.interfacce.PersonaListener
import com.joedayz.persistenciadatos.adapter.model.Persona

class PersonaAdapter(
    var listaPersona: MutableList<Persona>
) :
    RecyclerView.Adapter<PersonaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_persona, parent, false)
        return PersonaHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listaPersona.size
    }

    override fun onBindViewHolder(holder: PersonaHolder, position: Int) {
        val persona = listaPersona.get(position)
        holder.bind(persona)
    }

}