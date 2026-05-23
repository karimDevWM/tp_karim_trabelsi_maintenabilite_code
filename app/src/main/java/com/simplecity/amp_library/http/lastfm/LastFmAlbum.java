package com.simplecity.amp_library.http.lastfm;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class LastFmAlbum implements LastFmResult {

    @SerializedName("album")
    public Album album;

    public static class Album {
        private String name;
        @SerializedName("image")
        public List<LastFmImage> images = new ArrayList<>();
        private Wiki wiki;

        public String getName() {
            return name;
        }

        public String setName(String name) {
            this.name = name;
            return this.name;
        }

        public Wiki getWiki() {
            return wiki;
        }

        public Wiki setWiki(Wiki wiki) {
            this.wiki = wiki;
            return this.wiki;
        }
    }

    @Override
    public String getImageUrl() {
        if (album != null) {
            return LastFmUtils.getBestImageUrl(album.images);
        } else {
            return null;
        }
    }

    public static class Wiki {
        private String summary;

        public String getSummary() {
            return summary;
        }

        public String setWiki(String summary) {
            this.summary = summary;
            return this.summary;
        }
    }
}