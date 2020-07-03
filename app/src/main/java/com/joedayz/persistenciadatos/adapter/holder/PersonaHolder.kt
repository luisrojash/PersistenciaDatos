package com.joedayz.persistenciadatos.adapter.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.joedayz.persistenciadatos.R
import com.joedayz.persistenciadatos.adapter.interfacce.PersonaListener
import com.joedayz.persistenciadatos.adapter.model.Persona
import kotlinx.android.synthetic.main.item_persona.view.*

class PersonaHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(persona: Persona) {
        //    itemView.textViewIntro.setText(persona.nombre)
        itemView.imageView2.setBackgroundResource(persona.image)

        Glide
            .with(itemView.context)
            .load(persona.foto)
            .centerCrop()
            .into(itemView.imageView2)

    }


}