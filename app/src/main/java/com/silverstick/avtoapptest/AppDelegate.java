package com.silverstick.avtoapptest;

import android.content.Context;
import android.support.multidex.MultiDexApplication;
import android.support.v7.app.AppCompatDelegate;
import com.facebook.stetho.Stetho;

public class AppDelegate extends MultiDexApplication {

    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        sContext = getApplicationContext();
        Stetho.initializeWithDefaults(this);
    }


}
