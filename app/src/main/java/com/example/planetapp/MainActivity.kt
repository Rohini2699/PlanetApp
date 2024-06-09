package com.example.planetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 1 st step the view :Listview
        val listView:ListView =findViewById(R.id.listView)
        // 2 nd The data source
        val planet1 = Planet("Earth" ,"9" ,R.drawable.earth)
        val planet2 = Planet("Jupiter" ,"9" ,R.drawable.jupiter)
        val planet3 = Planet("Mars" ,"9" ,R.drawable.mars)
        val planet4 = Planet("Mercury" ,"9" ,R.drawable.mercury)
        val planet5 = Planet("Neptune" ,"9" ,R.drawable.neptune)
        val planet6 = Planet("pluto" ,"9" ,R.drawable.pluto)
        val planet7 = Planet("Saturn" ,"9" ,R.drawable.saturn)
        val planet8 = Planet("Uranus" ,"9" ,R.drawable.uranus)
        val planet9 = Planet("venus" ,"9" ,R.drawable.venus)
        var planetList = ArrayList<Planet>()
        planetList.add(planet1)
        planetList.add(planet2)
        planetList.add(planet3)
        planetList.add(planet4)
        planetList.add(planet5)
        planetList.add(planet6)
        planetList.add(planet7)
        planetList.add(planet8)
        planetList.add(planet9)
        //adpater
        var adapter = MycustomAdapter(this , planetList)
        listView.adapter= adapter







    }
}