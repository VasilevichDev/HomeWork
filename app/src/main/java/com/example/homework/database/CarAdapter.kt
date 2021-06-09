package com.example.homework.database

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.R
import org.w3c.dom.Text

class CarAdapter(private val car: List<Car>) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    inner class CarViewHolder(view: View) : RecyclerView.ViewHolder(view){

        fun setCars(itemView:View, position: Int){
            val car : Car = car [position]

            itemView.findViewById<TextView>(R.id.textView).text = car.brand
            itemView.findViewById<TextView>(R.id.textView2).text = car.price.toString()
            itemView.findViewById<TextView>(R.id.textView3).text = car.color

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_car_item , parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.setCars(holder.itemView, position)
    }

    override fun getItemCount(): Int {
       return car.size
    }
}