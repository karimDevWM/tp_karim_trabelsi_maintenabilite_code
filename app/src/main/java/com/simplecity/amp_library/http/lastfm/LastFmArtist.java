package com.simplecity.amp_library.http.lastfm;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class LastFmArtist implements LastFmResult {

    @SerializedName("artist")
    public Artist artist;

    public static class Artist {
        private String name;

        

        @SerializedName("image")
        public List<LastFmImage> images = new ArrayList<>();
        private Bio bio;

        public String getName() {
            return name;
        }

        public String setName(String name) {
            this.name = name;
            return this.name;
        }

        public Bio getBio() {
            return bio;
        }

        public Bio setBio(Bio bio) {
            this.bio = bio;
            return this.bio;
        }
    }

    @Override
    public String getImageUrl() {
        if (artist == null || artist.images == null || artist.images.isEmpty()) {
            return null;
        }
        return LastFmUtils.getBestImageUrl(artist.images);
    }

    public static class Bio {
        private String summary;

        public String getSummary() {
            return summary;
        }

        public String setSummary(String summary) {
            this.summary = summary;
            return this.summary;
        }
    }
}