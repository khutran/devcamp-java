package com.devcamp.artistalbum.controller;

import com.devcamp.artistalbum.model.Album;
import com.devcamp.artistalbum.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/album-info")
    public Album getAlbumInfo(@RequestParam int albumId) {
        return albumService.getAlbumById(albumId);
    }
}
