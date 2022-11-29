package com.example.navigationdrawer.recycler.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigationdrawer.R
import com.example.navigationdrawer.recycler.Informacion

class InformacionViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val nombreper =  view.findViewById<TextView>(R.id.tvNombre)
    val edadbreper =  view.findViewById<TextView>(R.id.tvEdad)
    val carreraper =  view.findViewById<TextView>(R.id.tvcarrera)
    val imagen = view.findViewById<ImageView>(R.id.ivImagen)

    fun render(infoModel: Informacion){
        nombreper.text = infoModel.nombre
        edadbreper.text = infoModel.año.toString()
        carreraper.text = infoModel.velmax
        Glide.with(imagen.context).load(infoModel.imagen).into(imagen)


    }
}