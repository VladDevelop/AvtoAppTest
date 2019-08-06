package com.silverstick.avtoapptest.models.api.response;

import android.arch.persistence.room.Entity;
import com.silverstick.avtoapptest.models.Rss;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "rss", strict=false)
public class LentaResponse {

    @Element(name = "rss")
    private Rss rss;

    public Rss getRss() {
        return rss;
    }

    public void setRss(Rss rss) {
        this.rss = rss;
    }

//    @Override
//    public String toString() {
//        return "ClassPojo [rss = " + rss + "]";
//    }


}
