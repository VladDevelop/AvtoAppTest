package com.silverstick.avtoapptest.features.main

import com.silverstick.avtoapptest.models.Rss
import com.silverstick.avtoapptest.repository.RepositoryProvider
import com.silverstick.avtoapptest.repository.database.DatabaseRepository
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

class MainActivityPresenter(private val mView: MainActivityView, private val mDatabaseRepository: DatabaseRepository) {

    private var mCompositeDisposable = CompositeDisposable()

    private lateinit var mResponse: Rss

    fun dispatchCreate() {

//        val disposable: Disposable = mDatabaseRepository.channels
//            .subscribe { databaseData ->
//                if (!databaseData.title.isNullOrEmpty()) {
//                    mView.showTitlesFromDb(databaseData.item)
//                } else {
//                    val rssDisposable: Disposable = RepositoryProvider.provideRssRepository()
//                        .rss
//                        .doOnNext{ response -> mDatabaseRepository.saveChannels(response.channel) }
//                        .subscribe{ response -> mView.showTitles(response.channel.item)}
//                    mCompositeDisposable.add(rssDisposable)
//                }
//            }

        //todo rebuild
        val rssDisposable: Disposable = RepositoryProvider.provideRssRepository()
            .rss
//            .doOnNext{ response -> mDatabaseRepository.saveChannels(response.channel) }
            .subscribe{ response -> {
                mResponse = response
                mView.showTitles(response.channel.item)
            }}
        mCompositeDisposable.add(rssDisposable)

//        mCompositeDisposable.add(disposable)

    }

    fun closeDisposable() {
        mCompositeDisposable.dispose()
    }

}