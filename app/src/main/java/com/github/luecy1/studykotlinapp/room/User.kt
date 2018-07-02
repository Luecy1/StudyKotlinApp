package com.github.luecy1.studykotlinapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class User(
        @PrimaryKey(autoGenerate = true)
        val id : Long,
        val name : String,
        val birthDay : Date
)