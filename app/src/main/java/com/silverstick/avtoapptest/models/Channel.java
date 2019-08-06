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
    @Path("channel")
    @ElementList(name = "item", inline = true/*, required = false*/)
    @TypeConverters(ItemConverter.class)
    @NonNull
    private List<Item> mItem = new ArrayList<>();

//    @Element(name = "image")
////    @ColumnInfo(name = "image")
//    private Image mImage;

    @Path("channel")
    @Element(name = "link")
    @ColumnInfo(name = "link")
    private String mLink;

    @Path("channel")
    @Element(name = "description")
    @ColumnInfo(name = "description")
    private String mDescription;

    @Path("channel")
    @Element(name = "language")
    @ColumnInfo(name = "language")
    private String mLanguage;

    @Path("channel")
    @Element(name = "title")
    @ColumnInfo(name = "title")
    private String mTitle;

    public void setItem(List<Item> item) {
        mItem = item;
    }
//
//    public void setImage(Image image) {
//        mImage = image;
//    }

    public void setLink(String link) {
        mLink = link;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

//    public Image getImage() {
//        return mImage;
//    }

    public List<Item> getItem() {
        return mItem;
    }

    public String getLink() {
        return mLink;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public String getTitle() {
        return mTitle;
    }
}

