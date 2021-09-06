package com.diego.kotlin.listalenguajesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

/**
 * Para utilizar un RecyclerView deberemos proporcionar los siguientes elementos:
 * . Adaptador propio que vincule nuestros datos con la interfaz.
 * . Layout manager que indique la distribución de los elementos en la lista.
 * . Decoradores y animaciones de forma opcional.
 */
class LenguajesActivityRecycler : AppCompatActivity(), SwipeRefreshLayout.OnRefreshListener {
    private var swipe: SwipeRefreshLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_lenguajes_recy)

        val recyclerView = findViewById<RecyclerView>(R.id.lista)

        //...swipe
        swipe = findViewById(R.id.swiperefresh)
        swipe?.setOnRefreshListener(this)

        val valoresLenguajes = mutableListOf<Lenguaje>()
        valoresLenguajes.add(Lenguaje("C", "Lenguaje procedural", R.mipmap.ic_launcher))
        valoresLenguajes.add(Lenguaje("Java", "Lenguaje orientado a objetos", R.drawable.ic_java))
        valoresLenguajes.add(Lenguaje("C++", "Lenguaje orientado a objetos", R.mipmap.ic_launcher))
        valoresLenguajes.add(Lenguaje("Python", "Lenguaje funcional", R.mipmap.ic_launcher))

        val adaptador = LenguajesAdapter(valoresLenguajes)
        recyclerView.adapter = adaptador

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

    override fun onRefresh() {
        // Realizar la acción para actualizar datos
        // ...
        // Hacemos desaparecer el indicador de progreso
        swipe?.isRefreshing = false
    }
}