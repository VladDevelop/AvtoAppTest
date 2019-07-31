package com.silverstick.avtoapptest.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;



@Database(entities = {ServiceCenter.class, GetShowcaseCarsListRequest.class, ShowcaseFavoriteCars.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    //don`t up version database without migration!!! otherwise users will lose data "GetShowcaseCarsListRequest.class" and "ShowcaseFavoriteCars.class"

    private static volatile AppDatabase sInstance;

    public abstract ServiceCentersDao serviceCentersDao();

    public abstract ShowcaseCarsListRequestDao showcaseCarsListRequestDao();

    public abstract FavoriteCarsDao favoriteCarsDao();

    public static AppDatabase getInstance(@NonNull Context context) {
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sInstance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "tts_database.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return sInstance;
    }
}
