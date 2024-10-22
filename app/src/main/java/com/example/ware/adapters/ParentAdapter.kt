package com.example.ware.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ware.R
import com.example.ware.models.ChildDataClass
import com.example.ware.models.ParentDataClass

class ParentAdapter(val parentList: List<ParentDataClass>) : RecyclerView.Adapter<ParentAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title : TextView = itemView.findViewById(R.id.hp_title)
        val rvChild : RecyclerView = itemView.findViewById(R.id.rv_child)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        return com.example.ware.adapters.ParentAdapter.ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = parentList[position]

        holder.title.text = currentItem.title
        holder.rvChild.setHasFixedSize(true)
        holder.rvChild.layoutManager = GridLayoutManager(holder.itemView.context, 1, RecyclerView.HORIZONTAL, false)

        val adapter = ChildAdapter(currentItem.childList)

        holder.rvChild.adapter = adapter
    }

    override fun getItemCount(): Int {
        return parentList.size
    }
}