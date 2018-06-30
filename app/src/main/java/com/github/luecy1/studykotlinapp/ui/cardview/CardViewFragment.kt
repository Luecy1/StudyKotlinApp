package com.github.luecy1.studykotlinapp.ui.cardview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.adapters.CardViewBindingAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.luecy1.studykotlinapp.R

class CardViewFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager

    private val TAG = "CardViewFragment"

    companion object {
        fun newInstance() = CardViewFragment()
    }

    private lateinit var viewModel: CardViewViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val rootView = inflater.inflate(R.layout.card_view_fragment, container, false)

        recyclerView =  rootView.findViewById(R.id.recycler_view)

        layoutManager = LinearLayoutManager(activity)

        setRecyclerViewLayoutManager()

        // Set CustomAdapter as the adapter for RecyclerView.
        recyclerView.adapter = CardRecyclerViewAdapter()

        return rootView
    }

    private fun setRecyclerViewLayoutManager() {
        var scrollPosition = 0

        // If a layout manager has already been set, get current scroll position.
        if (recyclerView.layoutManager != null) {
            scrollPosition = (recyclerView.layoutManager as LinearLayoutManager)
                    .findFirstCompletelyVisibleItemPosition()
        }

        layoutManager = LinearLayoutManager(activity)

        with(recyclerView) {
            layoutManager = this@CardViewFragment.layoutManager
            scrollToPosition(scrollPosition)
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CardViewViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
