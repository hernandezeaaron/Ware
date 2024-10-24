// WareAdapter.kt
package com.example.ware.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ware.R
import com.example.ware.models.WareDataClass

class WareAdapter(val wareList: List<WareDataClass>) : RecyclerView.Adapter<WareAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rvChild: RecyclerView = itemView.findViewById(R.id.rv_child)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.ware_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = wareList[position]
        holder.rvChild.setHasFixedSize(true)
        holder.rvChild.layoutManager = GridLayoutManager(holder.itemView.context, 3, RecyclerView.VERTICAL, false)

        val adapter = ChildAdapter(currentItem.wareList)
        holder.rvChild.adapter = adapter
    }

    override fun getItemCount(): Int {
        return wareList.size
    }
}