package com.devcamp.music.model;

import java.util.List;

public class Album {
    private String name;
    private List<String> songs;

    public Album() {
    }

    public Album(String n, List<String> s) {
        this.name = n;
        this.songs = s;
    }

    public List<String> getSongs() {
        return songs;
    }

    public String getAlbumName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
