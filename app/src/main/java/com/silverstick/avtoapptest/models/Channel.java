package com.silverstick.avtoapptest.models;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private Image mImage;

    private List<Item> mItem = new ArrayList<>();

    private String mLink;

    private String mDescription;

    private String mLanguage;

    private String mTitle;

    public Image getImage() {
        return mImage;
    }

    public void setImage(Image image) {
        mImage = image;
    }

    public List<Item> getItem() {
        return mItem;
    }

    public void setItem(List<Item> item) {
        mItem = item;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}

