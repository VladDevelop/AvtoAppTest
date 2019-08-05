package com.silverstick.avtoapptest.models;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "item")
public class Item {

    private Enclosure mEnclosure;

    private String mLink;

    private String mQuid;

    private String mDescription;

    @Element(name = "title")
    private String mTitle;

    private String mCategory;

    private String mPubDate;

    public String getTitle() {
        return mTitle;
    }

}
