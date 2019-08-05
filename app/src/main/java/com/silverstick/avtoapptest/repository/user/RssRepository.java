package com.silverstick.avtoapptest.repository.user;

import android.support.annotation.NonNull;
import com.silverstick.avtoapptest.models.Rss;
import com.silverstick.avtoapptest.utils.RxUtils;
import io.reactivex.Flowable;


public class RssRepository {

    @NonNull
    private final RssService mApi;

    public RssRepository(@NonNull RssService api) {
        mApi = api;
    }

//    @NonNull
//    public Observable<String> getTempToken(@NonNull String phoneNumber) {
//        return mApi.getTempToken(new GetTempTokenRequest(phoneNumber))
//                .compose(RxError.checkOnError())
//                .flatMap(response -> Observable.just(response.getTempToken()))
//                .compose(RxUtils.async());
//    }
//
//    @NonNull
//    public Observable<GetAccessTokenResponse> getAccessToken(@NonNull String phoneNumber,
//                                                             @NonNull String tempToken,
//                                                             @NonNull String code) {
//        return mApi.getAccessToken(new GetAccessTokenRequest(phoneNumber, tempToken, code))
//                .compose(RxError.checkOnError())
//                .compose(RxUtils.async());
//    }
//
    @NonNull
    public Flowable<Rss> getRss() {
        return mApi.getRss()
                .flatMap(Flowable::just)
                .compose(RxUtils.async());
    }
//
//    @NonNull
//    public Observable<AddUserNameResponse> addUserName(@NonNull String name,
//                                                       @NonNull String lastName) {
//        return RxDecor.authenticatedObservableApi(
//                mApi.addUserName(new AddUserNameRequest(name, lastName))
//                        .compose(RxError.checkOnError())
//                        .compose(RxUtils.async()));
//    }
//
//    @NonNull
//    public Observable<GetUserInfoResponse> getUserInfo() {
//        return RxDecor.authenticatedObservableApi(
//                mApi.getUserInfo()
//                        .compose(RxError.checkOnError())
//                        .compose(RxUtils.async()));
//    }
//
//    @NonNull
//    public Observable<BaseBody> logout() {
//        return RxDecor.authenticatedObservableApi(
//                mApi.logout()
//                        .compose(RxError.checkOnError())
//                        .compose(RxUtils.async()));
//    }
//
//    @NonNull
//    public Observable<BaseBody> callback() {
//        return RxDecor.authenticatedObservableApi(
//                mApi.callback()
//                        .compose(RxError.checkOnError())
//                        .compose(RxUtils.async()));
//    }
//
//    @NonNull
//    public Observable<BaseBody> setPushNotify(int status) {
//        return RxDecor.authenticatedObservableApi(
//                mApi.setPushNotify(new SetPushNotifyRequest(status))
//                        .compose(RxError.checkOnError())
//                        .compose(RxUtils.async()));
//    }
//
//    @NonNull
//    public Observable<BaseBody> setPushNotificationToken(@NonNull String token) {
//        return RxDecor.authenticatedObservableApi(
//                mApi.setPushNotificationsToken(new SetPushNotificationsTokenRequest(token))
//                        .compose(RxError.checkOnError())
//                        .compose(RxUtils.async()));
//    }
}
