// Repository.kt
package com.example.ware.data

import com.example.ware.models.ChildDataClass
import com.example.ware.models.ParentDataClass
import com.example.ware.models.WareDataClass
import com.example.ware.R

object Repository {

    fun getParentItemsList(): ArrayList<ParentDataClass> {
        val parentItemsList = ArrayList<ParentDataClass>()

        // Recent items
        val childItemsListRecent = ArrayList<ChildDataClass>()
        childItemsListRecent.add(ChildDataClass((R.drawable.book_eleven)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_twelve)))
        childItemsListRecent.add(ChildDataClass((R.drawable.book_thirteen)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_fourteen)))
        childItemsListRecent.add(ChildDataClass((R.drawable.book_fifteen)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_three)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_nine)))
        childItemsListRecent.add(ChildDataClass((R.drawable.book_four)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_six)))
        childItemsListRecent.add(ChildDataClass((R.drawable.movie_four)))

        // Add more items...
        parentItemsList.add(ParentDataClass("Recents", childItemsListRecent))

        // Books
        val childItemsListBooks = ArrayList<ChildDataClass>()
        childItemsListBooks.add(ChildDataClass((R.drawable.book_one)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_two)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_three)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_four)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_five)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_six)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_seven)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_eight)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_nine)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_ten)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_eleven)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_twelve)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_thirteen)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_fourteen)))
        childItemsListBooks.add(ChildDataClass((R.drawable.book_fifteen)))
        // Add more items...
        parentItemsList.add(ParentDataClass("Readlist", childItemsListBooks))

        // Movies
        val childItemsListMovies = ArrayList<ChildDataClass>()
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_one)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_two)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_three)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_four)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_five)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_six)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_seven)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_eight)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_nine)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_ten)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_eleven)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_twelve)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_thirteen)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_fourteen)))
        childItemsListMovies.add(ChildDataClass((R.drawable.movie_fifteen)))

        parentItemsList.add(ParentDataClass("Watchlist", childItemsListMovies))


        val childItemsListFavorites = ArrayList<ChildDataClass>()
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_fourteen)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_fifteen)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_three)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_four)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_four)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_five)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_six)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_one)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_one)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_two)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.movie_two)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_ten)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_eleven)))
        childItemsListFavorites.add(ChildDataClass((R.drawable.book_three)))

        parentItemsList.add(ParentDataClass("Favorites", childItemsListFavorites))

        return parentItemsList
    }

    fun getWareItemsFromWatchlist(): ArrayList<WareDataClass> {
        val wareItemsList = ArrayList<WareDataClass>()

        // Get the Watchlist child items from the existing parent items
        val parentItems = getParentItemsList()
        val watchlistItems = parentItems.find { it.title == "Watchlist" }?.childList ?: emptyList()

        // Create a WareDataClass instance using the watchlist items
        wareItemsList.add(WareDataClass(watchlistItems))

        return wareItemsList
    }

    fun getWareItemsFromReadlist(): ArrayList<WareDataClass> {
        val wareItemsList = ArrayList<WareDataClass>()

        // Get the Watchlist child items from the existing parent items
        val parentItems = getParentItemsList()
        val readlistItems = parentItems.find { it.title == "Readlist" }?.childList ?: emptyList()

        // Create a WareDataClass instance using the watchlist items
        wareItemsList.add(WareDataClass(readlistItems))

        return wareItemsList
    }
}
