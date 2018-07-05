package com.github.luecy1.studykotlinapp.room

import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun createUser(user: User)

    @Query("SELECT * FROM User")
    fun findAll() : List<User>

    @Update
    fun updateUser(user: User)

    @Delete
    fun delete(user: User)
}