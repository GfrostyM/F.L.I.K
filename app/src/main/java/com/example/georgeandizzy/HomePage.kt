package com.example.georgeandizzy

import android.adservices.ondevicepersonalization.InferenceInput
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    lateinit var titleUsername : TextView
    lateinit var button: Button
    lateinit var buttonChat: Button
    lateinit var buttonAccount: Button
    lateinit var buttonHelp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        titleUsername = findViewById(R.id.textView4)
        val name = intent.getStringExtra("username")
        titleUsername.text = "Hi ${name ?: "User"}"

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, Schedule::class.java)


            startActivity(intent)

        }
        buttonChat = findViewById(R.id.buttonChat)
        buttonChat.setOnClickListener {
            val intent = Intent(this, Chats::class.java)

            startActivity(intent)
        }

        buttonAccount = findViewById(R.id.buttonAccount)
        buttonAccount.setOnClickListener {
            val intent = Intent(this, Account::class.java)

            startActivity(intent)
        }

        buttonHelp = findViewById(R.id.buttonHelp)
        buttonHelp.setOnClickListener {
            val intent = Intent(this, Help::class.java)

            startActivity(intent)
        }
    }
}