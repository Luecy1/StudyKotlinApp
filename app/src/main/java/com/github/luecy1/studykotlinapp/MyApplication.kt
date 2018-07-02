package com.github.luecy1.studykotlinapp

import android.app.Application
import androidx.room.Room
import com.github.luecy1.studykotlinapp.room.Database

class MyApplication : Application() {

    companion object {
        lateinit var database: Database
    }

    override fun onCreate() {
        super.onCreate()

        database = Room
                .databaseBuilder(this,objectOf<Database>(),"kotlin_room_sample.db")
                .build()
    }

    internal inline fun <reified T : Any> objectOf() = T::class.java

}