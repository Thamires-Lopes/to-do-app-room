package com.example.todoapproom.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapproom.R
import com.example.todoapproom.database.Item
import kotlinx.android.synthetic.main.todo_item.view.*

class ItemsAdapter(
    private val items: List<Item>
) : RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_item, parent, false)
        return ItemsViewHolder(view)
    }

    override fun getItemCount() = items.count()

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bindView(items[position])
    }

    class ItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName = itemView.item_name

        fun bindView(item: Item) {
            itemName.text = item.name
        }
    }
}