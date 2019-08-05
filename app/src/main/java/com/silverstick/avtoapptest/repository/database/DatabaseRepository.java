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
            return null;
        })
                .compose(RxUtils.async())
                .subscribe();
    }

    @NonNull
    public Flowable<Channel> getChannels() {
        return Flowable.fromCallable(() -> mDatabase.channelDao().getChannel())
                .flatMap(this::groupChannel)
                .compose(RxUtils.async());
    }
//
//    @Override
//    public void saveShowcaseCarsListRequest(@NonNull GetShowcaseCarsListRequest showcaseCarsListRequest) {
//        Observable.fromCallable(() -> {
//            mDatabase.showcaseCarsListRequestDao().saveShowcaseCarsListRequest(showcaseCarsListRequest);
//            return null;
//        })
//                .compose(RxUtils.async())
//                .subscribe();
//    }
//
//    @Override
//    public void saveFavoriteCar(@NonNull ShowcaseFavoriteCars favoriteCars) {
//        Observable.fromCallable(() -> {
//            mDatabase.favoriteCarsDao().saveFavoriteCar(favoriteCars);
//            return null;
//        })
//                .compose(RxUtils.async())
//                .subscribe();
//    }
//
//    @NonNull
//    @Override
//    public Observable<List<ServiceCentersGroup>> getServiceCenterGroupedByBrandAndCity(long brandId, long cityId, boolean isGarant) {
//        if (brandId == 0 && cityId == 0 && isGarant) {
//            throw new IllegalArgumentException("BrandId and cityId are empty");
//        }
//
//        return Observable.fromCallable(() -> {
//            if (brandId == 0 && cityId == 0){
//                return mDatabase.serviceCentersDao().getServiceCentersByGarant(false);
//            }
//            if (cityId == 0) {
//                return mDatabase.serviceCentersDao().getServiceCentersByBrandIdAndGarant(brandId, isGarant);
//            } else if (brandId == 0) {
//                return mDatabase.serviceCentersDao().getServiceCentersByCityIdAndGarant(cityId, isGarant);
//            } else {
//                return mDatabase.serviceCentersDao().getServiceCentersByBrandIdAndCityIdAndGarant(brandId, cityId, isGarant);
//            }
//        })
//                .flatMap(this::groupServiceCentersByAddress)
//                .compose(RxUtils.async());
//    }
//
//
//
//    @NonNull
//    @Override
//    public Observable<List<ServiceCentersGroup>> getServiceCenterGroupedByCityAndGarant(long cityId, boolean isGarant) {
//
////        if (brandId == 0 && cityId == 0) {
////            throw new IllegalArgumentException("BrandId and cityId and isGarant are empty");
////        }
//
//        return Observable.fromCallable(() -> {
//            if (cityId == 0) {
//                return mDatabase.serviceCentersDao().getServiceCentersByGarant(isGarant);
////            } else if (brandId == 0) {
////                return mDatabase.serviceCentersDao().getServiceCentersByCityId(cityId);
////            } else if (garant) {
////                return mDatabase.serviceCentersDao().getServiceCentersByGarant(false);
////            } else if (!garant) {
////                return mDatabase.serviceCentersDao().getServiceCentersByGarant(true);
////            }
////            else if (brandId == 0 && garant){
////                return mDatabase.serviceCentersDao().getServiceCentersByGarant(true);
//            } else {
//                return mDatabase.serviceCentersDao().getServiceCentersByCityIdAndGarant(cityId, isGarant);
//            }
//        })
//                .flatMap(this::groupServiceCentersByAddress)
//                .compose(RxUtils.async());
//    }
//
//    @NonNull
//    @Override
//    public Observable<List<GetShowcaseCarsListRequest>> getShowcaseCarsListRequest() {
//        return Observable.fromCallable(() -> mDatabase.showcaseCarsListRequestDao().getShowcaseCarsListRequests())
//                .flatMap(this::groupShowcaseCarsListRequests)
//                .compose(RxUtils.async());
//    }
//
//    @NonNull
//    @Override
//    public Observable<List<ShowcaseFavoriteCars>> getFavoriteCars() {
//        return Observable.fromCallable(() -> mDatabase.favoriteCarsDao().getFavoriteCars())
//                .flatMap(this::groupFavoriteCars)
//                .compose(RxUtils.async());
//    }
//
//    @NonNull
//    @Override
//    public Observable<ShowcaseFavoriteCars> getFavoriteCarById(@NonNull Long autoId) {
//        return Observable.fromCallable(() -> mDatabase.favoriteCarsDao().getCarById(autoId))
//                .flatMap(this::favoriteCarById)
//                .compose(RxUtils.async());
//    }
//
//    @Override
//    public void deleteShowcaseCarsRequest(@NonNull GetShowcaseCarsListRequest showcaseCarsListRequest) {
//        Observable.fromCallable(() -> {
//            mDatabase.showcaseCarsListRequestDao().deleteRequest(showcaseCarsListRequest);
//            return null;
//        })
//                .compose(RxUtils.async())
//                .subscribe();
//    }
//
//    @Override
//    public void deleteFavoriteCar(@NonNull ShowcaseFavoriteCars favoriteCar) {
//        Observable.fromCallable(() -> {
//            mDatabase.favoriteCarsDao().deleteFavoriteCar(favoriteCar);
//            return null;
//        })
//                .compose(RxUtils.async())
//                .subscribe();
//    }
//
//    @Override
//    public void deleteLikeFavoriteCar(long auto_id) {
//        Observable.fromCallable(() -> {
//            mDatabase.favoriteCarsDao().deleteLikeFavoriteCar(auto_id);
//            return null;
//        })
//                .compose(RxUtils.async())
//                .subscribe();
//    }
//
////    @Override
////    public void updateLikeFavoriteCar(long auto_id, boolean isLike) {
////        Observable.fromCallable(() -> {
////            mDatabase.favoriteCarsDao().updateLikeFavoriteCar(auto_id, isLike);
////            return null;
////        })
////                .compose(RxUtils.async())
////                .subscribe();
////    }
//
//    @Override
//    public Observable<List<ShowcaseFavoriteCars>> updateLikeFavoriteCar(long auto_id, boolean isLike) {
//
//        return Observable.fromCallable(() -> {
//            mDatabase.favoriteCarsDao().updateLikeFavoriteCar(auto_id, isLike);
//            return mDatabase.favoriteCarsDao().getFavoriteCars();
//        })
//                .flatMap(this::groupFavoriteCars)
//                .compose(RxUtils.async());
//
//    }
//
//
//
//    @NonNull
//    private Observable<List<ServiceCentersGroup>> groupServiceCentersByAddress(@NonNull List<ServiceCenter> serviceCenters) {
//        final Map<String, List<ServiceCenter>> map = new HashMap<>();
//        for (final ServiceCenter serviceCenter : serviceCenters) {
//            List<ServiceCenter> list = map.get(serviceCenter.getAddress());
//            if (list == null) {
//                list = new ArrayList<>();
//                list.add(serviceCenter);
//                map.put(serviceCenter.getAddress(), list);
//            } else {
//                list.add(serviceCenter);
//            }
//        }
//
//        final List<ServiceCentersGroup> groupedServiceCenters = new ArrayList<>();
//        for (Map.Entry<String, List<ServiceCenter>> entry : map.entrySet()) {
//            groupedServiceCenters.add(new ServiceCentersGroup(entry.getValue()));
//        }
//
//        return Observable.just(groupedServiceCenters);
//    }
//
//    @NonNull
//    private Observable<List<GetShowcaseCarsListRequest>> groupShowcaseCarsListRequests(@NonNull List<GetShowcaseCarsListRequest> showcaseCarsListRequests) {
//        return Observable.just(showcaseCarsListRequests);
//    }
//
    @NonNull
    private Flowable<Channel> groupChannel(@NonNull Channel channel) {
        return Flowable.just(channel);
    }
//
//    @NonNull
//    private Observable<ShowcaseFavoriteCars> favoriteCarById(@NonNull ShowcaseFavoriteCars favoriteCars) {
//        return Observable.just(favoriteCars);
//    }
//
//    @NonNull
//    private Observable<Observable<List<ShowcaseFavoriteCars>>> updatedFavoriteCarById(@NonNull Observable<List<ShowcaseFavoriteCars>> favoriteCars) {
//        return Observable.just(favoriteCars);
//    }
}
