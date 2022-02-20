package com.example.planeto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var planet: List<PlanetData>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.title
        val planetImg: ImageView = view.plane_img
        val galaxy: TextView = view.galaxy
        val distance: TextView = view.distance
        val gravity: TextView = view.gravity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = planet[position].title
        holder.planetImg.setImageResource(planet[position].planetImage)
        holder.galaxy.text = planet[position].galaxy
        holder.distance.text = "${planet[position].distance} m km"
        holder.gravity.text = "${planet[position].gravity} m/s²"
    }

    override fun getItemCount(): Int {
        return planet.size
    }
}