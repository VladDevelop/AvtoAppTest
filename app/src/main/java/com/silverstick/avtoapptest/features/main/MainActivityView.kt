package com.silverstick.avtoapptest.features.main

import com.silverstick.avtoapptest.models.Item

interface MainActivityView {

    fun showTitlesFromDb(itemsList: List<Item>)

    fun showTitles(itemsList: List<Item>)

}