package com.example.todoapproom.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    val name: String,
    val description: String,

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
)