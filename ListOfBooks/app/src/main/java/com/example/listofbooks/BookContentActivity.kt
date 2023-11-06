package com.example.listofbooks

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BookContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_content)
        val bookCover : ImageView = findViewById(R.id.book_cover)
        bookCover.setImageResource(intent.getIntExtra("book_cover", 0))
        val bookName : TextView = findViewById(R.id.book_content_name)
        bookName.setText(intent.getIntExtra("book_name", 0))
        val bookWriter : TextView = findViewById(R.id.book_content_author)
        bookWriter.setText("نویسنده: " + resources.getString(intent.getIntExtra("book_author", 0)))
        val bookPublisher : TextView = findViewById(R.id.book_content_publisher)
        bookPublisher.setText("انتشارات: " + resources.getString(intent.getIntExtra("book_publisher", 0)))
        val bookContentDesc: TextView = findViewById(R.id.book_content_desc)
        bookContentDesc.movementMethod = ScrollingMovementMethod.getInstance()
        bookContentDesc.setText(intent.getIntExtra("book_desc", 0))
        val backButton : Button = findViewById(R.id.back_button)
        backButton.setOnClickListener{
            val i = Intent(this@BookContentActivity, MainActivity::class.java)
            startActivity(i)
        }
    }
}