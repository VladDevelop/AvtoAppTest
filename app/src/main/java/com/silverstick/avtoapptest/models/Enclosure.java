package com.silverstick.avtoapptest.models;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "enclosure", strict=false)
public class Enclosure {


    @Path("enclosure")
    @Element(name = "length")
    private String mLength;

    @Path("enclosure")
    @Element(name = "type")
    private String mType;

    @Path("enclosure")
    @Element(name = "url")
    private String mUrl;

    public String getLength() {
        return mLength;
    }

    public void setLength(String length) {
        mLength = length;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}
