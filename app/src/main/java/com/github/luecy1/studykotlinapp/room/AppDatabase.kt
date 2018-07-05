package com.github.luecy1.studykotlinapp.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 3)
abstract class AppDatabase :RoomDatabase() {
    abstract fun userDao() :UserDao
}