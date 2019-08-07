package com.silverstick.avtoapptest.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;
import com.silverstick.avtoapptest.database.ItemConverter;
import org.simpleframework.xml.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Root(name = "channel", strict=false)
public class Channel {

    @PrimaryKey
    @ColumnInfo(name = "item")
//    @Path("channel")
    @ElementList(name = "item", inline = true/*, required = false*/)
    @TypeConverters(ItemConverter.class)
    @NonNull
    private List<Item> item = new ArrayList<>();

//    @Element(name = "image")
////    @ColumnInfo(name = "image")
//    private Image mImage;

    @Path("link")
    @Text(required = false)
    @ColumnInfo(name = "link")
    private String link;

    @Element(name = "description")
    @ColumnInfo(name = "description")
    private String description;

    @Element(name = "language")
    @ColumnInfo(name = "language")
    private String language;

    @Element(name = "title")
    @ColumnInfo(name = "title")
    private String title;

    public void setItem(List<Item> item) {
        this.item = item;
    }
//
//    public void setImage(Image image) {
//        mImage = image;
//    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Image getImage() {
//        return mImage;
//    }

    public List<Item> getItem() {
        return item;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public String getTitle() {
        return title;
    }
}

