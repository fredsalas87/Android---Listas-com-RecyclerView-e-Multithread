package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

data class Filme(
    val nome: String,
    val imagemUrl: String
)

class ItemAdapter(
    val items: List<Filme>
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Filme) {
            val ivImagem = itemView.findViewById<ImageView>(R.id.ivImagem)
            val tvNome = itemView.findViewById<TextView>(R.id.tvNome)

            val capaGenerica = ResourcesCompat.getDrawable(itemView.resources, R.drawable.capa_generica, null)
            ivImagem.setImageDrawable(capaGenerica)

            Glide.with(itemView).load(item.imagemUrl).into(ivImagem)


            tvNome.text = item.nome
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    override fun getItemCount() = items.count()

}