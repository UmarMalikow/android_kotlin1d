package com.example.android_kotlin1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_kotlin1.model.Model
import com.example.android_kotlin1.R
import com.google.android.material.card.MaterialCardView

class Adapter(private val list: List<Model>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    private var list1 = listOf<Model>()

    fun setData(list: List<Model>){
        list1 = list
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private lateinit var mainContainer: MaterialCardView
//        private lateinit var ivImage: ImageView
        private lateinit var tvName: TextView

        init {
            tvName = view.findViewById(R.id.tv_name)
        }

        fun onBind(character: Model) {
//            Glide.with(ivImage.context).load(character.imageUrl).into(ivImage)
            tvName.text = character.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])

    }
    override fun getItemCount(): Int = list.size
}