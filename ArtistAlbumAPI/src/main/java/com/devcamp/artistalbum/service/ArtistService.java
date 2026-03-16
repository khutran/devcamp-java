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
        
        // Artist 4: Ed Sheeran (56D.30 update)
        ArrayList<Album> edAlbums = new ArrayList<>(Arrays.asList(
            new Album(401, "Divide", new ArrayList<>(Arrays.asList("Shape of You", "Perfect"))),
            new Album(402, "Multiply", new ArrayList<>(Arrays.asList("Sing", "Thinking Out Loud"))),
            new Album(403, "Equals", new ArrayList<>(Arrays.asList("Bad Habits", "Shivers")))
        ));
        artists.add(new Artist(4, "Ed Sheeran", edAlbums));

        // Artist 5: Drake (56D.30 update)
        ArrayList<Album> drakeAlbums = new ArrayList<>(Arrays.asList(
            new Album(501, "Scorpion", new ArrayList<>(Arrays.asList("God's Plan", "In My Feelings"))),
            new Album(502, "Views", new ArrayList<>(Arrays.asList("Hotline Bling", "One Dance"))),
            new Album(503, "Certified Lover Boy", new ArrayList<>(Arrays.asList("Way 2 Sexy", "Fair Trade")))
        ));
        artists.add(new Artist(5, "Drake", drakeAlbums));

        // Artist 6: Adele (56D.30 update)
        ArrayList<Album> adeleAlbums = new ArrayList<>(Arrays.asList(
            new Album(601, "30", new ArrayList<>(Arrays.asList("Easy On Me", "Oh My God"))),
            new Album(602, "25", new ArrayList<>(Arrays.asList("Hello", "Send My Love"))),
            new Album(603, "21", new ArrayList<>(Arrays.asList("Rolling in the Deep", "Someone Like You")))
        ));
        artists.add(new Artist(6, "Adele", adeleAlbums));

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
