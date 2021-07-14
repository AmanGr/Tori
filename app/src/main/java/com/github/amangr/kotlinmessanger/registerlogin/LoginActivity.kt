package com.github.amangr.kotlinmessanger.registerlogin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.amangr.kotlinmessanger.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            val email = emailL.text.toString()
            val password = passwordL.text.toString()

            Log.d("Login", "Attempt to login with email/pass: $email/***")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
        }

        backToR.setOnClickListener {
            finish()
        }
    }
}