package com.example.listofbooks

class MyBook {


    data class Book(
        val name: Int,
        val author: Int,
        val publisher: Int,
        val desc: Int,
        val image: Int
    )

    fun initialBooks(): List<Book> {
        return listOf<Book>(
            Book(
                R.string.book_1_name,
                R.string.book_1_author,
                R.string.book_1_publisher,
                R.string.book_1_desc,
                R.drawable.book1
            ),
            Book(
                R.string.book_2_name,
                R.string.book_2_author,
                R.string.book_2_publisher,
                R.string.book_2_desc,
                R.drawable.book2
            ),
            Book(
                R.string.book_3_name,
                R.string.book_3_author,
                R.string.book_3_publisher,
                R.string.book_3_desc,
                R.drawable.book3
            ),
            Book(
                R.string.book_4_name,
                R.string.book_4_author,
                R.string.book_4_publisher,
                R.string.book_4_desc,
                R.drawable.book4
            ),
            Book(
                R.string.book_5_name,
                R.string.book_5_author,
                R.string.book_5_publisher,
                R.string.book_5_desc,
                R.drawable.book5
            )
        )
    }


}