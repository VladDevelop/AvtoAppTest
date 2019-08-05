package com.silverstick.avtoapptest.database;

import android.arch.persistence.room.*;
import com.silverstick.avtoapptest.models.Channel;

import java.util.List;

@Dao
public abstract class ChannelDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void insertChannel(Channel serviceCenter);

    @Query("SELECT * FROM Channel")
    public abstract Channel getChannel();

    @Transaction
    public void saveChannels(Channel channel) {
        insertChannel(channel);
    }

}
