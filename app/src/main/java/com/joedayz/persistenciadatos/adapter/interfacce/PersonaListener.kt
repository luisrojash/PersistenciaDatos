package com.joedayz.persistenciadatos.adapter.interfacce

import com.joedayz.persistenciadatos.adapter.model.Persona

interface PersonaListener {
    fun onClickPersona(persona: Persona)
}