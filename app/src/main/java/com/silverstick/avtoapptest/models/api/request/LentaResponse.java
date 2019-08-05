package com.silverstick.avtoapptest.models.api.request;

import android.arch.persistence.room.Entity;
import com.silverstick.avtoapptest.models.Rss;

public class LentaResponse {

    private Rss rss;

    public Rss getRss() {
        return rss;
    }

    public void setRss(Rss rss) {
        this.rss = rss;
    }

    @Override
    public String toString() {
        return "ClassPojo [rss = " + rss + "]";
    }


}
