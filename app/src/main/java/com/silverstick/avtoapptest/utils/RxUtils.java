package com.silverstick.avtoapptest.utils;

import android.support.annotation.NonNull;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import org.reactivestreams.Publisher;

public final class RxUtils {

    private RxUtils() {
    }

    @NonNull
    public static <T> FlowableTransformer<T, T> async() {
        return upstream -> upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}