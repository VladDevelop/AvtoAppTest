package com.silverstick.avtoapptest.repository.user;


import com.silverstick.avtoapptest.models.api.response.Rss;
import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface RssService {

    @GET("rss")
    Flowable<Rss> getRss();

}
