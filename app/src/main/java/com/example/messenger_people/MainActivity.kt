package com.example.messenger_people

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messenger_people.adapter.StorieAdapter
import com.example.messenger_people.model.Storie

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        refreshAdapter(getAllStorie())

    }

    fun refreshAdapter(stories: ArrayList<Storie>) {
        var adapter = StorieAdapter(this, stories)
        recyclerView.adapter = adapter
    }

    fun getAllStorie(): ArrayList<Storie> {
        var stories = ArrayList<Storie>()

        stories.add(Storie(R.drawable.xemis, R.drawable.plus, "Boboyev Otabek"))
        stories.add(Storie(R.drawable.blue_car, R.drawable.carr, "Boboyev Otabek", 1))
        stories.add(Storie(R.drawable.carr, R.drawable.pink_car, "Boboyev Otabek", 1))
        stories.add(Storie(R.drawable.carr, R.drawable.blue_car, "Boboyev Otabek", 1))
        stories.add(Storie(R.drawable.blue_car, R.drawable.pink_car, "Boboyev Otabek", 1))
        stories.add(Storie(R.drawable.blue_car, R.drawable.carr, "Boboyev Otabek", 1))
        stories.add(Storie(R.drawable.carr, R.drawable.pink_car, "Boboyev Otabek", 1))
        stories.add(Storie(R.drawable.carr, R.drawable.blue_car, "Boboyev Otabek", 1))


        return stories
    }
}