package com.silverstick.avtoapptest.models.api.response;

import com.silverstick.avtoapptest.models.Channel;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rss", strict=false)
public class Rss {

    @Element(name = "channel")
    private Channel mChannel;

    @Element(name = "version", required = false)
    private String mVersion;

    public Channel getChannel() {
        return mChannel;
    }

    public void setChannel(Channel channel) {
        mChannel = channel;
    }

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String version) {
        mVersion = version;
    }

}
