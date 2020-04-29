package com.example.todoapproom.ui.main

import androidx.lifecycle.ViewModel
import com.example.todoapproom.database.Item

class MainViewModel: ViewModel() {

    fun testAdapter(): List<Item> {
        return listOf(
            Item("item um", "isso é um teste"),
            Item("item dois", "isso é um teste"),
            Item("item 3", "isso é um teste"),
            Item("item um", "isso é um teste"),
            Item("item dois", "isso é um teste"),
            Item("item um", "isso é um teste"),
            Item("item dois", "isso é um teste"),
            Item("item um", "isso é um teste"),
            Item("item dois", "isso é um teste"),
            Item("item um", "isso é um teste"),
            Item("item dois", "isso é um teste")
        )
    }
}