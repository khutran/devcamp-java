package com.devcamp.music.model;

import java.util.List;

public class Artist extends Composer {
    private List<Album> albums;

    public Artist() {
    }

    public Artist(String fn, String ln, String sn, List<Album> albs) {
        super(fn, ln, sn);
        this.albums = albs;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
