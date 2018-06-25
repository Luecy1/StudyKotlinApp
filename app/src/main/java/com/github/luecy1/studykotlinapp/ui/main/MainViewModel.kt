package com.github.luecy1.studykotlinapp.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var message = "Hello"
    var text = ObservableField<String>()

    init {
        text.set("text")
    }

}
