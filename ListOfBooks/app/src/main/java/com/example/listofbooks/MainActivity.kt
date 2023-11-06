package com.example.listofbooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var isLinearLayoutManager = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = MyBook().initialBooks()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val recyclerAdapter = SetItem(this, dataset)
        recyclerView.adapter = recyclerAdapter
        recyclerAdapter.onItemClick = { book : MyBook.Book ->
            val intent = Intent(this@MainActivity, BookContentActivity::class.java)
            intent.putExtra("book_cover", book.image)
            intent.putExtra( "book_name", book.name)
            intent.putExtra( "book_author", book.author)
            intent.putExtra("book_publisher", book.publisher)
            intent.putExtra("book_desc", book.desc)
            startActivity(intent)
        }
        recyclerView.setHasFixedSize(true)
    }


}