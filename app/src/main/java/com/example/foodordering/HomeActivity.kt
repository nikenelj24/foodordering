package com.example.foodordering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Makanan 1", "Mcd", R.drawable.mkn1))
        list.add(Model("Makanan 2", "Burger", R.drawable.mkn2))
        list.add(Model("Makanan 3", "Pasta", R.drawable.mkn4))
        list.add(Model("Makanan 4", "Es krim", R.drawable.mkn6))


        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 1 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 2 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 3 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }

        }


    }
}
