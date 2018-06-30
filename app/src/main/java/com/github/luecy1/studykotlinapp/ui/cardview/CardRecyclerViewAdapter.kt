package com.github.luecy1.studykotlinapp.ui.cardview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.luecy1.studykotlinapp.R

class CardRecyclerViewAdapter(private val dataSet : Array<String>) :
        RecyclerView.Adapter<CardRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.card_item, viewGroup, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Log.d("App", "Element $position set.")
        viewHolder.textView.text = dataSet[position]
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val textView :TextView

        init {
            v.setOnClickListener{ Log.d("App", "Element $adapterPosition clicked.") }
            textView = v.findViewById(R.id.textView2)
        }
    }


}