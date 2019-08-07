package com.silverstick.avtoapptest.features.main

import com.silverstick.avtoapptest.repository.RepositoryProvider
import com.silverstick.avtoapptest.repository.database.DatabaseRepository
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

class MainActivityPresenter(private val mView: MainActivityView, private val mDatabaseRepository: DatabaseRepository) {

    private var mCompositeDisposable = CompositeDisposable()

    fun dispatchCreate() {

        val disposable: Disposable = mDatabaseRepository.channels
            .subscribe { databaseData ->
                if (!databaseData.item.isNullOrEmpty()) {
                    mView.showTitlesFromDb(databaseData.item)
                } else {
                    val rssDisposable: Disposable = RepositoryProvider.provideRssRepository()
                        .rss
                        .subscribe{ response ->
                            run {
                                mDatabaseRepository.saveChannels(response.channel)
                                mView.showTitles(response.channel.item)
                            }
                        }
                    mCompositeDisposable.add(rssDisposable)
                }
            }
        mCompositeDisposable.add(disposable)
    }

    fun closeDisposable() {
        mCompositeDisposable.dispose()
    }

}