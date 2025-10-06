package com.hninhninwai.xyz.newsapp.db

import androidx.room.TypeConverter
import com.hninhninwai.xyz.newsapp.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source?): String? {
        return source?.name
    }

    @TypeConverter
    fun toSource(name: String?): Source? {
        return if(name != null) Source(name, name) else null
    }
}