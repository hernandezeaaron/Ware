package com.example.ware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        val textView = findViewById<TextView>(R.id.linkToLogin)
        val text = "Already have an account? Login"

        val spannableString = SpannableString(text)

        val loginStartIndex = text.indexOf("Login")
        val loginEndIndex = loginStartIndex + "Login".length

        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(this@SignUp, Login::class.java)
                startActivity(intent)
            }
        }

        spannableString.setSpan(clickableSpan, loginStartIndex, loginEndIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = spannableString
        textView.movementMethod = LinkMovementMethod.getInstance()

        val textView2 = findViewById<TextView>(R.id.checkbox_tac)
        val text2 = "Do you agree to our Terms and Privacy Policy?"
        val spannableString2 = SpannableString(text2)
        val tacStartIndex = text2.indexOf("Terms and Privacy Policy")
        val tacEndIndex = tacStartIndex + "Terms and Privacy Policy".length

        val clickableSpan2 = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(this@SignUp, TermsAndPrivacy::class.java)
                startActivity(intent)
            }
        }

        spannableString2.setSpan(clickableSpan2, tacStartIndex, tacEndIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView2.text = spannableString2
        textView2.movementMethod = LinkMovementMethod.getInstance()

        val btnGetReady: Button = findViewById(R.id.SignUp)
        btnGetReady.setOnClickListener {
            val intent = Intent(this, Intro::class.java)
            startActivity(intent)
        }
    }
}