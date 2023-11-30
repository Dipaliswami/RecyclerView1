package com.example.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerMessage: RecyclerView
    private lateinit var messagesAdapter: MessagesAdapter
    private val messages = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerMessage = findViewById(R.id.recyclerMessages)

        initMessages()
        messagesAdapter = MessagesAdapter(messages)
        recyclerMessage.adapter = messagesAdapter

       // LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerMessage.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }

    private fun initMessages() {
        for (i in 0..20) {
            messages.add(" $i - hello am dipali swami  ")
        }
    }
}
