package com.silverstick.avtoapptest.database;

import android.arch.persistence.room.TypeConverter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.silverstick.avtoapptest.models.Item;
import com.silverstick.avtoapptest.utils.Logger;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ItemConverter {

    @TypeConverter
    public static String toString(List<Item> list) {
        final ObjectMapper mapper = new ObjectMapper();
        try {
            return list == null ? null : mapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            Logger.e(e);
            return null;
        }
    }

    @TypeConverter
    public static List<Item> toList(String string) {
        final ObjectMapper mapper = new ObjectMapper();
        try {
            return string == null ? null : mapper.readValue(string, new TypeReference<List<Item>>() {
            });
        } catch (IOException e) {
            Logger.e(e);
            return Collections.emptyList();
        }
    }

}
