package com.silverstick.avtoapptest.repository.database;

import android.support.annotation.NonNull;
import com.silverstick.avtoapptest.models.Channel;
import com.silverstick.avtoapptest.models.Item;
import io.reactivex.Flowable;

import java.util.List;


public interface DatabaseService {
//
    void saveChannels(@NonNull Channel channel);

    Flowable<Channel> getChannels();
//
//    void saveShowcaseCarsListRequest(@NonNull GetShowcaseCarsListRequest showcaseCarsListRequest);
//
//    void saveFavoriteCar(@NonNull ShowcaseFavoriteCars favoriteCars);
//
//    @NonNull
//    Observable<List<ServiceCentersGroup>> getServiceCenterGroupedByBrandAndCity(long brandId, long cityId, boolean isGarant);
//
//    @NonNull
//    Observable<List<ServiceCenter>> getServiceCentersByAddress(long cityId, @NonNull String address);
//
//    @NonNull
//    Observable<List<ServiceCentersGroup>> getServiceCenterGroupedByCityAndGarant(long cityId, boolean isGarant);
//
//    @NonNull
//    Observable<List<GetShowcaseCarsListRequest>> getShowcaseCarsListRequest();
//
//    Observable<List<ShowcaseFavoriteCars>> getFavoriteCars();
//
//    @NonNull
//    Observable<ShowcaseFavoriteCars> getFavoriteCarById(@NonNull Long auto_id);
//
//    void deleteShowcaseCarsRequest(@NonNull GetShowcaseCarsListRequest showcaseCarsListRequest);
//
//    void deleteFavoriteCar(@NonNull ShowcaseFavoriteCars favoriteCar);
//
//    Observable<List<ShowcaseFavoriteCars>> updateLikeFavoriteCar(long auto_id, boolean isLike);
//
////    void updateLikeFavoriteCar(long auto_id, boolean isLike);
//
//    void deleteLikeFavoriteCar(long auto_id);

}
