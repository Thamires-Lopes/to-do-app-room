package com.example.todoapproom.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ItemDao {
    @Insert
    fun addItem(item: Item)

    @Query("SELECT * FROM Item")
    fun getAllItems() : List<Item>

    @Insert
    fun addMultipleItems(vararg item: Item) //do I need this?
}