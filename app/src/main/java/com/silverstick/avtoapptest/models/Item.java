package com.silverstick.avtoapptest.models;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "item", strict=false)
public class Item {

    @Path("item")
    @Element(name = "enclosure")
    private Enclosure mEnclosure;

    @Path("item")
    @Element(name = "link")
    private String mLink;

    @Path("item")
    @Element(name = "quid")
    private String mQuid;

    @Path("item")
    @Element(name = "description")
    private String mDescription;

    @Path("item")
    @Element(name = "title")
    private String mTitle;

    @Path("item")
    @Element(name = "category")
    private String mCategory;

    @Path("item")
    @Element(name = "pubDate")
    private String mPubDate;

    public String getTitle() {
        return mTitle;
    }

}
