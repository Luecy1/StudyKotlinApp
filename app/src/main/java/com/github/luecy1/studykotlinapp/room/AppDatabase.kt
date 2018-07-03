package com.github.luecy1.studykotlinapp.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserDao::class], version = 3)
abstract class AppDatabase :RoomDatabase() {
    abstract fun userDao() :UserDao
}