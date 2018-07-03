package com.github.luecy1.studykotlinapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User constructor (
        @PrimaryKey
        var id: Int,
        var name: String,
        var birthDay : String
)