package com.silverstick.avtoapptest.features.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.silverstick.avtoapptest.models.Item

class MainActivityAdapter(listItems: List<Item>): RecyclerView.Adapter<MainActivityHolder>() {

    private var mListItems: List<Item> = listItems

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MainActivityHolder {
        return MainActivityHolder(viewGroup).buildForParent(viewGroup)
    }

    override fun getItemCount(): Int {
        return mListItems.size
    }

    override fun onBindViewHolder(holder: MainActivityHolder, position: Int) {
        holder.bindView(mListItems[position].title)
    }

}