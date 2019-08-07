package com.silverstick.avtoapptest.repository.database;

import android.content.Context;
import android.support.annotation.NonNull;
import com.silverstick.avtoapptest.database.AppDatabase;
import com.silverstick.avtoapptest.models.Channel;
import com.silverstick.avtoapptest.utils.RxUtils;
import io.reactivex.Flowable;

public class DatabaseRepository implements DatabaseService {
    //
    private final AppDatabase mDatabase;

    //
    public DatabaseRepository(@NonNull Context context) {
        mDatabase = AppDatabase.getInstance(context);
    }

    @Override
    public void saveChannels(@NonNull Channel channel) {
        Flowable.fromCallable(() -> {
            mDatabase.channelDao().saveChannels(channel);
            return true;
        })
                .compose(RxUtils.async())
                .subscribe();
    }

    @NonNull
    public Flowable<Channel> getChannels() {
        return Flowable.fromCallable(() -> {
            if(mDatabase.channelDao().getChannel() != null) {
                return mDatabase.channelDao().getChannel();
            } else {
                return new Channel();
            }
        })
                .flatMap(this::groupChannel)
                .compose(RxUtils.async());

    }

    @NonNull
    private Flowable<Channel> groupChannel(@NonNull Channel channel) {
        return Flowable.just(channel);
    }

}
