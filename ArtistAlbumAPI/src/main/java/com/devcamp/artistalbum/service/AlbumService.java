package com.devcamp.artistalbum.service;

import com.devcamp.artistalbum.model.Album;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class AlbumService {
    public ArrayList<Album> getAllAlbums() {
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album(101, "After Hours", new ArrayList<>(Arrays.asList("Blinding Lights", "Save Your Tears"))));
        albums.add(new Album(102, "Starboy", new ArrayList<>(Arrays.asList("Starboy", "I Feel It Coming"))));
        albums.add(new Album(103, "Dawn FM", new ArrayList<>(Arrays.asList("Take My Breath", "Gasoline"))));
        
        albums.add(new Album(201, "Midnights", new ArrayList<>(Arrays.asList("Anti-Hero", "Lavender Haze"))));
        albums.add(new Album(202, "Folklore", new ArrayList<>(Arrays.asList("Cardigan", "Exile"))));
        albums.add(new Album(203, "Evermore", new ArrayList<>(Arrays.asList("Willow", "Champagne Problems"))));
        
        albums.add(new Album(301, "Justice", new ArrayList<>(Arrays.asList("Peaches", "Ghost"))));
        albums.add(new Album(302, "Purpose", new ArrayList<>(Arrays.asList("Sorry", "What Do You Mean"))));
        albums.add(new Album(303, "Changes", new ArrayList<>(Arrays.asList("Yummy", "Intentions"))));
        
        return albums;
    }

    public Album getAlbumById(int id) {
        for (Album album : getAllAlbums()) {
            if (album.getId() == id) {
                return album;
            }
        }
        return null;
    }
}
