package com.example.ware.adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ware.R
import com.example.ware.models.ChildDataClass

class ChildAdapter(val childList: List<ChildDataClass>) : RecyclerView.Adapter<ChildAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgChild : ImageView = itemView.findViewById(R.id.img_child)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = childList[position]

        holder.imgChild.setImageResource(currentItem.image)
    }

    override fun getItemCount(): Int {
        return childList.size
    }
}