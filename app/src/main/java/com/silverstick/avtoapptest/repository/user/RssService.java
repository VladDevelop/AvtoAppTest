package com.silverstick.avtoapptest.repository.user;


import com.silverstick.avtoapptest.models.Rss;
import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.POST;



public interface RssService {

    @POST("rss")
    Flowable<Rss> getRss();

}
