package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adapter -> É a classe do Andorid que serve como base para a lista
        // Cada lista precisa de um adapter customizado
        // A customização serve para dizer como o adapter irá carregar elementos
        // Além disso, o adapter define o Layout XML de cada item
        // e como faremos para inserir informações nesse layout
        //
        // LayoutManager -> Também é uma classe do Android que usamos para definir
        // como uma lista será estruturada
        // As opções são: Linear (Horizontal ou Vertical), Staggered, ect

        val rvLista = findViewById<RecyclerView>(R.id.rvLista)

        rvLista.layoutManager = LinearLayoutManager(this)

        val harryPotter = Filme("Harry Potter", "https://static.wikia.nocookie.net/harrypotter/images/9/9c/Capa_Harry_Potter_e_a_Pedra_Filosofal_%28filme%29.jpg/revision/latest?cb=20130101153136&path-prefix=pt-br")
        val senhorDosAneis = Filme("Senhor dos Anéis", "https://upload.wikimedia.org/wikipedia/pt/3/38/Lord_of_the_Rings_Fellowship_of_the_Ring.jpg")
        val rambo = Filme("Rambo", "https://midia.gruposinos.com.br/_midias/png/2017/10/27/rambo-3241333.png")
        val homenAranha = Filme("Homen Aranha", "https://upload.wikimedia.org/wikipedia/pt/1/14/Spide-Man_Poster.jpg")
        val xMen = Filme("X-Men", "https://upload.wikimedia.org/wikipedia/pt/0/06/X-Men_Filme.jpg")
        val homenDeFerro = Filme("Homen de Ferro", "https://static.wikia.nocookie.net/dublagempedia/images/3/31/81ldPRJJWKL._AC_SX425_.jpg/revision/latest?cb=20200318211649&path-prefix=pt-br")


        val items = listOf(harryPotter, senhorDosAneis, rambo, homenAranha, xMen, homenDeFerro)
        rvLista.adapter = ItemAdapter(items)
    }
}