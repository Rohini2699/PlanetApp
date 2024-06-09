package com.example.planetapp

import android.content.Context
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
//import kotlinx.coroutines.flow.internal.NoOpContinuation.context



public class MycustomAdapter (context: Context , val Planets:ArrayList<Planet>):BaseAdapter() {
    val inflater = context.getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return Planets.size
        // returns the number of items in the data set

    }

    override fun getItem(position: Int): Any {

        // returns the data item associated with the specified position in list
        return Planets[position]

    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
        // return a unique identifier for the item at specified position .
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        //returns a view that displays the data at the specified position in the list .
        // This method is called by the adapter view , which is in this case the list view to get view for each item to be displayed in the UI .
        // if the convert view is null we have to create a new view .
        //the parent  view group that  this view will eventually be attatched to
        val view: View
        if (convertView == null) {
            view = inflater.inflate(R.layout.list_item, parent, false)
        } else {
            view = convertView
        }
        // Bind data to the view
        val item = getItem(position) as Planet

        val titleTextView = view.findViewById<TextView>(R.id.textView)
        val mooncounttextview = view.findViewById<TextView>(R.id.textView2)
        val moon_image = view.findViewById<ImageView>(R.id.imageView)
        titleTextView.text = item.title
        mooncounttextview.text = item.mooncount
        moon_image.setImageResource(item.imagePlanet)
        view.setOnClickListener(){it
        Toast.makeText(view.context ,"You clicked ${item.title}",Toast.LENGTH_SHORT).show()
        }
        return view


    }

}