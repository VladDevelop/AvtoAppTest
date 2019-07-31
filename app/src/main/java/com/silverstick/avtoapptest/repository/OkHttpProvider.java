package com.silverstick.avtoapptest.repository;

import android.support.annotation.NonNull;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;


public final class OkHttpProvider {

    private OkHttpProvider() {
    }

    @NonNull
    public static OkHttpClient provideClient() {
        final OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(60, TimeUnit.SECONDS);
        builder.readTimeout(60, TimeUnit.SECONDS);

        return builder.build();
    }

}
