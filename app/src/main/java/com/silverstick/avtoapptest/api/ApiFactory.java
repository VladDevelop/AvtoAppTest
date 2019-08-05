package com.silverstick.avtoapptest.api;

import android.support.annotation.NonNull;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.silverstick.avtoapptest.BuildConfig;
import com.silverstick.avtoapptest.repository.OkHttpProvider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

import java.util.TimeZone;

public class ApiFactory {

    private static Retrofit sRetrofit;

    private static OkHttpClient sHttpClient;

    private ApiFactory() {
    }

    @NonNull
    public static Retrofit getRetrofitInstance() {
        if (sRetrofit == null) {
            final ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setTimeZone(TimeZone.getDefault());
            sRetrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.API_BASE_URL)
                    .client(provideClient())
                    .addConverterFactory(SimpleXmlConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return sRetrofit;
    }

    public static OkHttpClient getHttpClient() {
        return sHttpClient;
    }

    @NonNull
    private static OkHttpClient provideClient() {
        if (sHttpClient == null) {
            sHttpClient = OkHttpProvider.provideClient();
        }
        return sHttpClient;
    }
}
