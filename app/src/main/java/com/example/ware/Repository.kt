// Repository.kt
package com.example.ware.data

import com.example.ware.models.ChildDataClass
import com.example.ware.models.ParentDataClass
import com.example.ware.R

object Repository {

    fun getParentItemsList(): ArrayList<ParentDataClass> {
        val parentItemsList = ArrayList<ParentDataClass>()

        // Recent items
        val childItemsListRecent = ArrayList<ChildDataClass>()
        childItemsListRecent.add(ChildDataClass((R.drawable.book_one)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_one)))
        childItemsListRecent.add(ChildDataClass((R.drawable.book_two)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_two)))
        childItemsListRecent.add(ChildDataClass((R.drawable.book_three)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_three)))
        childItemsListRecent.add(ChildDataClass((R.drawable.book_four)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_four)))

        // Add more items...
        parentItemsList.add(ParentDataClass("Recents", childItemsListRecent))

        // Books
        val childItemsListBooks = ArrayList<ChildDataClass>()
        childItemsListBooks.add(ChildDataClass((R.drawable.book_one)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_two)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_three)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_four)))
        // Add more items...
        parentItemsList.add(ParentDataClass("Readlist", childItemsListBooks))

        // Movies
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

        parentItemsList.add(ParentDataClass("Favorites", childItemsListFavorites))

        return parentItemsList
    }
}
