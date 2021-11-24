package com.example.aula08_listas

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TurmaSelectionRecyclerViewHolder (itemView:View):
    RecyclerView.ViewHolder(itemView)
{
        val turmaPosicao = itemView.findViewById<TextView>(R.id.item_number_textview)
        val turmaDesignacao = itemView.findViewById<TextView>(R.id.item_string_textview)
}