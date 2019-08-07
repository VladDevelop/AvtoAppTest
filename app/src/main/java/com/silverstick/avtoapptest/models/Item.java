package com.silverstick.avtoapptest.models;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "item", strict=false)
public class Item {

    @Element(name = "enclosure")
    private Enclosure enclosure;

    @Path("item")
    @Element(name = "link")
    private String link;

    @Path("quid")
    @Text(required = false)
    private String quid;

    @Element(name = "description")
    private String description;

    @Element(name = "title")
    private String title;

    @Element(name = "category")
    private String category;

    @Element(name = "pubDate")
    private String pubDate;

    public String getTitle() {
        return title;
    }

}
