package com.simplecity.amp_library.model;

import java.io.Serializable;

public class Artist implements Serializable {

    private long id;
    public long getId() {
        return this.id;
    }
    public long setId(long id) {
        this.id = id;
        return this.id;
    }
    
    private String name;
    public String getName() {
        return this.name;
    }
    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    private int numAlbums;
    public int getNumAlbums() {
        return this.numAlbums;
    }
    public int setNumAlbums(int numAlbums) {
        this.numAlbums = numAlbums;
        return this.numAlbums;
    }

    private int numSongs;
    public int getNumSongs() {
        return this.numSongs;
    }
    public int setNumSongs(int numSongs) {
        this.numSongs = numSongs;
        return this.numSongs;
    }

    public Artist(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        if (id != artist.id) return false;
        if (numAlbums != artist.numAlbums) return false;
        if (numSongs != artist.numSongs) return false;
        return name != null ? name.equals(artist.name) : artist.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + numAlbums;
        result = 31 * result + numSongs;
        return result;
    }
}