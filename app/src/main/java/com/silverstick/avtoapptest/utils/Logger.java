package com.silverstick.avtoapptest.utils;


import android.support.annotation.NonNull;
import android.util.Log;
import com.silverstick.avtoapptest.BuildConfig;

public final class Logger {

    private Logger() {
        throw new IllegalStateException("Utility class can not be instantiated");
    }

    public static void e(@NonNull Throwable e) {
        Log.e("ii", e.getMessage(), e);
    }

    public static void e(@NonNull String message, @NonNull Throwable throwable) {
        Log.e("ii", message, throwable);
    }

    public static void e(@NonNull Class<?> cls, @NonNull String msg, @NonNull Throwable thr) {
        Log.e(cls.getSimpleName(), msg, thr);
    }

    public static void w(@NonNull Class<?> cls, @NonNull String msg) {
        Log.w(cls.getSimpleName(), msg);
    }
}