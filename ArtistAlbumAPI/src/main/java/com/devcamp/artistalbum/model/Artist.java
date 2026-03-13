package com.devcamp.artistalbum.model;

import java.util.ArrayList;

public class Artist {
    private int id;
    private String name;
    private ArrayList<Album> albums;

    public Artist() {
    }

    public Artist(int id, String name) {
        this.id = id;
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public Artist(int id, String name, ArrayList<Album> albums) {
        this.id = id;
        this.name = name;
        this.albums = albums;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
