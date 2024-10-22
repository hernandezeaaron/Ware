package com.example.ware

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val signUpTextView = findViewById<TextView>(R.id.linkToSignUp)
        val text = "Don't have an account? Sign Up"

        // Create a SpannableString
        val spannableString = SpannableString(text)

        // Find the start and end index of "Sign Up" in the string
        val signUpStartIndex = text.indexOf("Sign Up")
        val signUpEndIndex = signUpStartIndex + "Sign Up".length

        // Create a ClickableSpan for "Sign Up"
        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                // Intent to navigate to SignUpActivity
                val intent = Intent(this@Login, SignUp::class.java)
                startActivity(intent)
            }
        }

        // Apply the clickable span to the words "Sign Up"
        spannableString.setSpan(clickableSpan, signUpStartIndex, signUpEndIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Set the spannable string to the TextView
        signUpTextView.text = spannableString

        // Make the TextView clickable
        signUpTextView.movementMethod = LinkMovementMethod.getInstance()

        val btnGetReady: Button = findViewById(R.id.Login)
        btnGetReady.setOnClickListener {
            val intent = Intent(this, Intro::class.java)
            startActivity(intent)
        }
    }
}