package com.talib.matrix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerAdapter(val list: List<String>,val listOfIcons: List<Int>): RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.cateogry_icon)
        val title: TextView = itemView.findViewById(R.id.category_title)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.ctegory_list_item,parent,false)
        val viewHolder = MyViewHolder(view)
        return viewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = list[position]
        holder.img.setImageDrawable(holder.itemView.context.resources.getDrawable(listOfIcons[position]))
    }

    override fun getItemCount(): Int = list.size
}