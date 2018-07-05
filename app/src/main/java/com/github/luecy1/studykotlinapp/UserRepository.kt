package com.github.luecy1.studykotlinapp

import com.github.luecy1.studykotlinapp.room.User
import com.github.luecy1.studykotlinapp.room.UserDao

class UserRepository(val dao : UserDao){

    suspend fun createUser(user: User) {
        dao.createUser(user)
    }
}