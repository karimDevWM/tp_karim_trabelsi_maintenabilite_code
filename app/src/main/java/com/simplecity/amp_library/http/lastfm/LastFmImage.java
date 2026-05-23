package com.simplecity.amp_library.http.lastfm;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("WeakerAccess")
public class LastFmImage {

    @SerializedName("#text")
    public String url;

    private String size;

    public String getSize() {
        return this.size;
    }

    public String setSize(String size) {
        this.size = size;
        return this.size;
    }
}