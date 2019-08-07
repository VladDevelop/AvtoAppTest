package com.silverstick.avtoapptest.features.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import com.silverstick.avtoapptest.R
import com.silverstick.avtoapptest.features.main.adapter.MainActivityAdapter
import com.silverstick.avtoapptest.models.Item
import com.silverstick.avtoapptest.repository.RepositoryProvider

class MainActivity : AppCompatActivity(), MainActivityView {

    lateinit var mPresenter: MainActivityPresenter

    lateinit var mRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter = MainActivityPresenter(this, RepositoryProvider.provideDatabaseRepository(this))

        setupViews()
        mPresenter.dispatchCreate()
    }

    override fun onDestroy() {
        mPresenter.closeDisposable()
        super.onDestroy()
    }


    override fun showTitles(itemsList: List<Item>) {
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = MainActivityAdapter(itemsList)
    }

    override fun showTitlesFromDb(itemsList: List<Item>) {
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = MainActivityAdapter(itemsList)
    }

    private fun setupViews() {
        mRecyclerView = findViewById(R.id.recyclerView)
    }
}
