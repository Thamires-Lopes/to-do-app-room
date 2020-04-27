package com.example.todoapproom.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapproom.R
import com.example.todoapproom.models.Item
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(recyclerviewItems){
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = ItemsAdapter(testAdapter())
        }
    }

    fun testAdapter(): List<Item> {
        return listOf(
            Item("item um"),
            Item("item dois"),
            Item("item 3"),
            Item("item um"),
            Item("item dois"),
            Item("item um"),
            Item("item dois"),
            Item("item um"),
            Item("item dois"),
            Item("item um"),
            Item("item dois")
        )
    }
}
