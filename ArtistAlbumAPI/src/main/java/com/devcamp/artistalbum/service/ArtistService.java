package com.devcamp.artistalbum.service;

import com.devcamp.artistalbum.model.Album;
import com.devcamp.artistalbum.model.Artist;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ArtistService {
    public ArrayList<Artist> getAllArtists() {
        ArrayList<Artist> artists = new ArrayList<>();

        // Artist 1: The Weeknd
        ArrayList<Album> weekndAlbums = new ArrayList<>(Arrays.asList(
            new Album(101, "After Hours", new ArrayList<>(Arrays.asList("Blinding Lights", "Save Your Tears"))),
            new Album(102, "Starboy", new ArrayList<>(Arrays.asList("Starboy", "I Feel It Coming"))),
            new Album(103, "Dawn FM", new ArrayList<>(Arrays.asList("Take My Breath", "Gasoline")))
        ));
        artists.add(new Artist(1, "The Weeknd", weekndAlbums));

        // Artist 2: Taylor Swift
        ArrayList<Album> taylorAlbums = new ArrayList<>(Arrays.asList(
            new Album(201, "Midnights", new ArrayList<>(Arrays.asList("Anti-Hero", "Lavender Haze"))),
            new Album(202, "Folklore", new ArrayList<>(Arrays.asList("Cardigan", "Exile"))),
            new Album(203, "Evermore", new ArrayList<>(Arrays.asList("Willow", "Champagne Problems")))
        ));
        artists.add(new Artist(2, "Taylor Swift", taylorAlbums));

        // Artist 3: Justin Bieber
        ArrayList<Album> justinAlbums = new ArrayList<>(Arrays.asList(
            new Album(301, "Justice", new ArrayList<>(Arrays.asList("Peaches", "Ghost"))),
            new Album(302, "Purpose", new ArrayList<>(Arrays.asList("Sorry", "What Do You Mean"))),
            new Album(303, "Changes", new ArrayList<>(Arrays.asList("Yummy", "Intentions")))
        ));
        artists.add(new Artist(3, "Justin Bieber", justinAlbums));

        return artists;
    }

    public Artist getArtistById(int id) {
        for (Artist artist : getAllArtists()) {
            if (artist.getId() == id) {
                return artist;
            }
        }
        return null;
    }
}
