package com.diego.kotlin.listalenguajesrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LenguajesAdapter(val lenguajes: List<Lenguaje>) : RecyclerView.Adapter<LenguajesAdapter.ViewHolder?>() {
    // ...

    /**
     * Proporciona una referencia al tipo de vistas que está utilizando.
     */
    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var nombre: TextView
        var descripcion: TextView
        var icono: ImageView

        /**
         * metodo bind
         * vuelca los datos de un objeto Lenguaje a la interfaz
         */
        fun bind(l: Lenguaje) {
            nombre.text = l.nombre
            descripcion.text = l.descripcion
            icono.setImageResource(l.icono)
        }

        //obtenemos todos los campos cuyo contenido queramos modificar
        // y los guardamos como variables de la clase
        init {
            nombre = v.findViewById(R.id.nombre)
            descripcion = v.findViewById(R.id.descripcion)
            icono = v.findViewById(R.id.icono)
        }
    }

    /**
     * deberá inicializar la interfaz de un item de la lista a partir del layout
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_lenguaje, parent, false)
        return ViewHolder(v)
    }

    /**
     * una vez creado el ViewHolder con el anterior metodo 'onCreateViewHolder'
     * se actualizarán los campos de la interfaz del ViewHolder
     * con los del item que corresponda a la posición(position) indicada.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lenguajes[position])
    }

    /**
     * por ultimo con getItemCount
     * solo indicaremos el número de items que tendrá la lista
     */
    override fun getItemCount(): Int {
        return lenguajes.size
    }

}