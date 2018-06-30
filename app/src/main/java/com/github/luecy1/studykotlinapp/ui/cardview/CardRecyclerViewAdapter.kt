package com.github.luecy1.studykotlinapp.ui.cardview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.github.luecy1.studykotlinapp.BR
import com.github.luecy1.studykotlinapp.R

class CardRecyclerViewAdapter :
        RecyclerView.Adapter<CardRecyclerViewAdapter.ViewHolder>() {

    private var dataset: List<CardViewItem>
    init {
        dataset = listOf()

        for(i in 0..30){
            dataset += CardViewItem(ObservableField("This is element # $i"))
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.card_item, viewGroup, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Log.d("App", "Element $position set.")

        val item = dataset[position]
        viewHolder.bind.setVariable(BR.cardItem, item)
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val textView :TextView
        val bind : ViewDataBinding
        init {
            v.setOnClickListener{ Log.d("App", "Element $adapterPosition clicked.") }
            textView = v.findViewById(R.id.textView2)

            bind = DataBindingUtil.bind(v)!!
        }
    }
}