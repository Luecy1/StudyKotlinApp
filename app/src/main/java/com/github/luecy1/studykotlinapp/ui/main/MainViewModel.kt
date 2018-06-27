package com.github.luecy1.studykotlinapp.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var message = ObservableField<String>()
    val text = MutableLiveData<String>()

    init {
        message.set("Hello")
    }

}
