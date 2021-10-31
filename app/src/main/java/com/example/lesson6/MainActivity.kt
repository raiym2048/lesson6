package com.example.lesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*var listView:ListView? = null
        listView = findViewById(R.id.listView)
        val nameList = ArrayList<String>()
        nameList.add("aaa")
        nameList.add("bbb")
        nameList.add("ccc")
        nameList.add("ddd")
        nameList.add("eee")
        nameList.add("hhh")

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nameList)
        listView.adapter = adapter

        listView.setOnItemClickListener{parent,view,position,id ->
            Toast.makeText(this,"position is ${nameList[position]}",Toast.LENGTH_SHORT).show()
        }*/
    }
}