package com.example.ware

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ware.adapters.ParentAdapter
import com.example.ware.models.ChildDataClass
import com.example.ware.models.ParentDataClass


class HomePage : AppCompatActivity() {


    val parentItemsList = ArrayList<ParentDataClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        val rvParent = findViewById<RecyclerView>(R.id.rv_parent)
        rvParent.setHasFixedSize(true)
        rvParent.layoutManager = LinearLayoutManager(this)

        val adapter = ParentAdapter(parentItemsList)

        setData()

        rvParent.adapter = adapter

    }

    private fun setData() {

        val childItemsListRecent = ArrayList<ChildDataClass>()

        childItemsListRecent.add(ChildDataClass((R.drawable.book_one)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_one)))
        childItemsListRecent.add(ChildDataClass((R.drawable.book_two)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_two)))
        childItemsListRecent.add(ChildDataClass((R.drawable.book_three)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_three)))
        childItemsListRecent.add(ChildDataClass((R.drawable.book_four)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_four)))

        parentItemsList.add(ParentDataClass("Recents", childItemsListRecent))

        val childItemsListBooks = ArrayList<ChildDataClass>()

        childItemsListBooks.add(ChildDataClass((R.drawable.book_one)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_two)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_three)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_four)))

        parentItemsList.add(ParentDataClass("Readlist", childItemsListBooks))

        val childItemsListMovies = ArrayList<ChildDataClass>()

        childItemsListMovies.add(ChildDataClass((R.drawable.movie_one)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_two)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_three)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_four)))

        parentItemsList.add(ParentDataClass("Watchlist", childItemsListMovies))

        val childItemsListFavorites = ArrayList<ChildDataClass>()

        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_three)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_four)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_four)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_one)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_one)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_two)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_two)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_three)))

        parentItemsList.add(ParentDataClass("Recents", childItemsListFavorites))
    }

}