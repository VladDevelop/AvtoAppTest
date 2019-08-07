package com.silverstick.avtoapptest.repository.user;

import android.support.annotation.NonNull;
import com.silverstick.avtoapptest.models.api.response.Rss;
import com.silverstick.avtoapptest.utils.RxUtils;
import io.reactivex.Flowable;


public class RssRepository {

    @NonNull
    private final RssService mApi;

    public RssRepository(@NonNull RssService api) {
        mApi = api;
    }

    @NonNull
    public Flowable<Rss> getRss() {
        return mApi.getRss()
                .flatMap(Flowable::just)
                .compose(RxUtils.async());
    }
}
