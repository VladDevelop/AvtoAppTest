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
        builder.connectTimeout(20, TimeUnit.SECONDS);
        builder.readTimeout(20, TimeUnit.SECONDS);
        return builder.build();
    }

}
