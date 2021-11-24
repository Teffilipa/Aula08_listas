package com.example.aula08_listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //1. declaração de variavel para lidar com recycler view

    lateinit var turmasRecyclerView: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //2. Obter ID da Recycler View

        turmasRecyclerView = findViewById(R.id.turmas_recyclerview)

        //3. Especificar como serao apresentados os itens
        // Alternativas: GridLayoutmanager, StaggeredGridLayoutManager

        turmasRecyclerView.layoutManager = LinearLayoutManager(this)

        //4. especificar como serao obtidos os dados

        turmasRecyclerView.adapter = TurmaSelectionRecyclerViewAdapter ()
    }
}