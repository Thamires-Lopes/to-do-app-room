package com.example.todoapproom.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ItemDao {
    @Insert
    suspend fun addItem(item: Item)

    @Query("SELECT * FROM Item")
    suspend fun getAllItems() : List<Item>

    @Insert
    suspend fun addMultipleItems(vararg item: Item) //do I need this?
}