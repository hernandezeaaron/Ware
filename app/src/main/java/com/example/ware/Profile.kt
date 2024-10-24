package com.example.ware

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val btnHome: ImageButton = findViewById(R.id.btn_home)

        btnHome.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        val btnReadlist: ImageButton = findViewById(R.id.btn_readlist)

        btnReadlist.setOnClickListener {
            val intent = Intent(this, Readlist::class.java)
            startActivity(intent)
        }

        val btnWatchList: ImageButton = findViewById(R.id.btn_watchlist)

        btnWatchList.setOnClickListener {
            val intent = Intent(this, Watchlist::class.java)
            startActivity(intent)
        }
    }
}