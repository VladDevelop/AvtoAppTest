package com.silverstick.avtoapptest.features.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.silverstick.avtoapptest.R
import kotlinx.android.synthetic.main.li_titles.view.*

class MainActivityHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var mTitleName = itemView.tvTitleName

    fun buildForParent(parent: ViewGroup): MainActivityHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.li_titles, parent, false)
//        setupViews(view)
        return MainActivityHolder(view)
    }

    fun bindView(titleName: String) {
        mTitleName.text = titleName
    }

}