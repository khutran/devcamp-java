package com.devcamp.music.controller;

import com.devcamp.music.model.Artist;
import com.devcamp.music.model.Band;
import com.devcamp.music.model.Composer;
import com.devcamp.music.service.ComposerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ComposerController {

    @Autowired
    private ComposerService composerService;

    @GetMapping("/bands")
    public ArrayList<Band> getBands() {
        return composerService.getAllBands();
    }

    @GetMapping("/artists")
    public ArrayList<Artist> getArtists() {
        ArrayList<Artist> artists = new ArrayList<>();
        ArrayList<Composer> allComposers = composerService.getAllComposers();
        for (Composer composer : allComposers) {
            if (composer instanceof Artist) {
                artists.add((Artist) composer);
            }
        }
        return artists;
    }
}
