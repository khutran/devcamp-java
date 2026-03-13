package com.devcamp.music.controller;

import com.devcamp.music.model.Album;
import com.devcamp.music.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/albums")
    public ArrayList<Album> getAlbums() {
        return albumService.getAllAlbums();
    }
}
