package com.example.viewpager_test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager_test.databinding.RecyclerViewItemBinding

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    val plantList = listOf(1,2,3,4,5,6)

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val binding = RecyclerViewItemBinding.bind(itemView)

        fun bind(plant: Plant) = with(binding){
            title.text = plant.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(Plant(plantList[position].toString()))
    }

    override fun getItemCount(): Int {
        return plantList.size
    }
}