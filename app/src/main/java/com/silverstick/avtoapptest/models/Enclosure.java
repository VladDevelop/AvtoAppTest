package com.silverstick.avtoapptest.models;


import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "enclosure", strict=false)
public class Enclosure {

    @Path("length")
    @Text(required = false)
    private String length;

    @Path("type")
    @Text(required = false)
    private String type;

    @Path("url")
    @Text(required = false)
    private String url;

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
