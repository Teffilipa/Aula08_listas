package com.example.aula08_listas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TurmaSelectionRecyclerViewAdapter:
    RecyclerView.Adapter<TurmaSelectionRecyclerViewHolder>()
{
    val listaTurmas = arrayOf("Eng Ambiente", "Direito", "Eng Informática")
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TurmaSelectionRecyclerViewHolder {

        //1

        val view = LayoutInflater.from(parent.context).inflate(R.layout.turma_selection_view_holder, parent, false)

        return TurmaSelectionRecyclerViewHolder(view)
        //TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TurmaSelectionRecyclerViewHolder, position: Int) {
        holder.turmaPosicao.text = (position + 1).toString()
        holder.turmaDesignacao.text = listaTurmas[position]
        // TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        // TODO("Not yet implemented")
        return listaTurmas.size
    }


}

