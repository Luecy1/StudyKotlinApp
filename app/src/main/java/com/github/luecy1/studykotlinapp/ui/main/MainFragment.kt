package com.github.luecy1.studykotlinapp.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.github.luecy1.studykotlinapp.CardViewActivity
import com.github.luecy1.studykotlinapp.R
import com.github.luecy1.studykotlinapp.databinding.MainFragmentBinding

class MainFragment : Fragment() , MainEventHandler{

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.main_fragment,
                container,
                false
        )

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        binding.viewModel = viewModel
        binding.eventHandler = this

        setupObserver()
    }

    private fun setupObserver() {
        viewModel.text.observe(this, Observer {
            viewModel.message.set(it ?: "")
        })
    }

    override fun onclick() {
        if ("クリックしました。".equals(binding.message.text.toString())) {
            val intent = Intent(this.context, CardViewActivity::class.java)
            startActivity(intent)
        } else {
            viewModel.text.postValue("クリックしました。")
        }
    }

    override fun gotoRoom() {
        if (activity != null) {
            (activity as MainActivityCallback).replaceFragment()
        }
    }

}
