package com.silverstick.avtoapptest.models;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;

public class AtomLink {

    @Path("atom:link")
    @Element(name = "rel")
    private String mRel;

    @Path("atom:link")
    @Element(name = "href")
    private String mHref;

    @Path("atom:link")
    @Element(name = "type")
    private String mType;

    public String getRel() {
        return mRel;
    }

    public void setRel(String rel) {
        mRel = rel;
    }

    public String getHref() {
        return mHref;
    }

    public void setHref(String href) {
        mHref = href;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }
}
