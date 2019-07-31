package com.silverstick.avtoapptest.repository;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.silverstick.avtoapptest.api.ApiFactory;
import com.silverstick.avtoapptest.repository.database.DatabaseRepository;
import com.silverstick.avtoapptest.repository.user.UserRepository;
import com.silverstick.avtoapptest.repository.user.UserService;

public class RepositoryProvider {

    @Nullable
    private static UserRepository sUserRepository;

    @Nullable
    private static DatabaseRepository sDatabaseRepository;

    private RepositoryProvider() {
        //Not implemented
    }

    @NonNull
    private static <T> T getServiceInstance(Class<T> clazz) {
        return ApiFactory.getRetrofitInstance().create(clazz);
    }

    @NonNull
    public static UserRepository provideUserRepository() {
        if (sUserRepository == null) {
            sUserRepository = new UserRepository(getServiceInstance(UserService.class));
        }
        return sUserRepository;
    }

    @NonNull
    public static DatabaseRepository provideDatabaseRepository(@NonNull Context context) {
        if (sDatabaseRepository == null) {
            sDatabaseRepository = new DatabaseRepository(/*context*/);
        }
        return sDatabaseRepository;
    }



}
