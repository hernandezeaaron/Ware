package com.example.ware

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ware.adapters.ParentAdapter
import com.example.ware.data.Repository

class HomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)


        val btnProfile: ImageButton = findViewById(R.id.btn_profile)

        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val btnWatchList: ImageButton = findViewById(R.id.btn_watchlist)

        btnWatchList.setOnClickListener {
            val intent = Intent(this, Watchlist::class.java)
            startActivity(intent)
        }

        val btnReadlist: ImageButton = findViewById(R.id.btn_readlist)

        btnReadlist.setOnClickListener {
            val intent = Intent(this, Readlist::class.java)
            startActivity(intent)
        }

        val rvParent = findViewById<RecyclerView>(R.id.rv_parent)
        rvParent.setHasFixedSize(true)
        rvParent.layoutManager = LinearLayoutManager(this)

        val adapter = ParentAdapter(Repository.getParentItemsList())
        rvParent.adapter = adapter

    }

}