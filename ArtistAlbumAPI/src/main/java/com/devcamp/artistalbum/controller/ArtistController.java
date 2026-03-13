package com.devcamp.artistalbum.controller;

import com.devcamp.artistalbum.model.Artist;
import com.devcamp.artistalbum.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping("/artists")
    public ArrayList<Artist> getArtists() {
        return artistService.getAllArtists();
    }

    @GetMapping("/artist-info")
    public Artist getArtistInfo(@RequestParam int artistId) {
        return artistService.getArtistById(artistId);
    }
}
