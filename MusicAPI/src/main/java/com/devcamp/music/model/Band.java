package com.devcamp.music.model;

import java.util.List;

public class Band {
    private String bandname;
    private List<BandMember> members;
    private List<Album> albums;

    public Band() {
    }

    public Band(String bn, List<BandMember> mem, List<Album> albs) {
        this.bandname = bn;
        this.members = mem;
        this.albums = albs;
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public String getBandName() {
        return bandname;
    }

    public List<BandMember> getMembers() {
        return members;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setBandname(String bandname) {
        this.bandname = bandname;
    }

    public void setMembers(List<BandMember> members) {
        this.members = members;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
