package com.github.luecy1.studykotlinapp

import android.app.Application
import androidx.room.Room
import com.github.luecy1.studykotlinapp.room.AppDatabase

class MyApplication : Application() {

    companion object {
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room
                .databaseBuilder(this,AppDatabase::class.java,"kotlin_room_sample.db")
                .build()
    }

}