package com.example.ware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        findViewById<CheckBox>(R.id.checkbox_tac)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "TAC is checked: $isChecked")
            }

        val textView = findViewById<TextView>(R.id.linkToLogin)
        val text = "Already have an account? Login"

        // Create a SpannableString
        val spannableString = SpannableString(text)

        // Find the start and end index of "Login" in the string
        val loginStartIndex = text.indexOf("Login")
        val loginEndIndex = loginStartIndex + "Login".length

        // Create a ClickableSpan for "Login"
        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                // Intent to navigate to LoginActivity
                val intent = Intent(this@SignUp, Login::class.java)
                startActivity(intent)
            }
        }

        // Apply the clickable span to the word "Login"
        spannableString.setSpan(clickableSpan, loginStartIndex, loginEndIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Set the spannable string to the TextView
        textView.text = spannableString

        // Make the TextView clickable
        textView.movementMethod = LinkMovementMethod.getInstance()

        val btnGetReady: Button = findViewById(R.id.SignUp)
        btnGetReady.setOnClickListener {
            val intent = Intent(this, Intro::class.java)
            startActivity(intent)
        }
    }
}