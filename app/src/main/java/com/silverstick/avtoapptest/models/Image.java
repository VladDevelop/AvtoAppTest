package com.silverstick.avtoapptest.models;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "image", strict=false)
public class Image {

    @Path("image")
    @Element(name = "link")
    private String mLink;

    @Path("image")
    @Element(name = "width")
    private String mWidth;

    @Path("image")
    @Element(name = "title")
    private String mTitle;

    @Path("image")
    @Element(name = "url")
    private String mUrl;

    @Path("image")
    @Element(name = "height")
    private String mHeight;

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public String getWidth() {
        return mWidth;
    }

    public void setWidth(String width) {
        mWidth = width;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getHeight() {
        return mHeight;
    }

    public void setHeight(String height) {
        mHeight = height;
    }
}
