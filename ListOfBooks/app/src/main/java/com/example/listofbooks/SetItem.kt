package com.example.listofbooks

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class SetItem(private val context: Context, private val dataset: List<MyBook.Book>) :
    RecyclerView.Adapter<SetItem.ItemViewHolder>() {
    var onItemClick: ((MyBook.Book) -> Unit)? = null

    inner class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val bookImage: ImageView = view.findViewById(R.id.book_image_card)
        val bookName: TextView = view.findViewById(R.id.book_name)
        val bookWriter: TextView = view.findViewById(R.id.book_writer)

        init {
            view.setOnClickListener {
                onItemClick?.invoke(dataset[adapterPosition])
            }
        }
    }
    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.items_of_books, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.bookImage.setImageResource(item.image)
        holder.bookName.text = context.resources.getString(item.name)
        holder.bookWriter.text = context.resources.getString(item.author)
    }

}

