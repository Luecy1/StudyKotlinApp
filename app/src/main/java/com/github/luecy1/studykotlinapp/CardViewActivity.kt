package com.github.luecy1.studykotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.luecy1.studykotlinapp.ui.cardview.CardViewFragment

class CardViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_view_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, CardViewFragment.newInstance())
                    .commitNow()
        }
    }

}
