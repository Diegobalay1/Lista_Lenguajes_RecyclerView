package com.diego.kotlin.listalenguajesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Para utilizar un RecyclerView deberemos proporcionar los siguientes elementos:
 * . Adaptador propio que vincule nuestros datos con la interfaz.
 * . Layout manager que indique la distribución de los elementos en la lista.
 * . Decoradores y animaciones de forma opcional.
 */
class LenguajesActivityRecycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_lenguajes_recy)
    }
}