package com.github.luecy1.studykotlinapp.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.luecy1.studykotlinapp.R
import com.github.luecy1.studykotlinapp.ui.room.RoomFragment

class MainActivity : AppCompatActivity() , MainActivityCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }

    override fun replaceFragment() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, RoomFragment.newInstance())
                .commitNow()
    }
}
