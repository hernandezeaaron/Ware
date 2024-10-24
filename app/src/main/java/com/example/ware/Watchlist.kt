package com.example.ware

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ware.adapters.WareAdapter
import com.example.ware.data.Repository
import com.example.ware.models.WareDataClass


class Watchlist : AppCompatActivity() {

    private lateinit var rvWatchlist: RecyclerView
    private lateinit var wareAdapter: WareAdapter
    private lateinit var wareItems: ArrayList<WareDataClass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_watchlist)

        val btnProfile: ImageButton = findViewById(R.id.btn_profile)

        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val btnReadlist: ImageButton = findViewById(R.id.btn_readlist)

        btnReadlist.setOnClickListener {
            val intent = Intent(this, Readlist::class.java)
            startActivity(intent)
        }

        val btnHome: ImageButton = findViewById(R.id.btn_home)

        btnHome.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        rvWatchlist = findViewById(R.id.watchlist_rvp)

        rvWatchlist.layoutManager = LinearLayoutManager(this)

        wareItems = Repository.getWareItemsFromWatchlist()

        wareAdapter = WareAdapter(wareItems)
        rvWatchlist.adapter = wareAdapter
    }
}