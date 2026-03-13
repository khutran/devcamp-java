package com.devcamp.music.service;

import com.devcamp.music.model.Album;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class AlbumService {
    public ArrayList<Album> getAllAlbums() {
        ArrayList<Album> albums = new ArrayList<>();
        
        albums.add(new Album("Thriller", Arrays.asList("Wanna Be Startin' Somethin'", "Thriller", "Beat It")));
        albums.add(new Album("Back in Black", Arrays.asList("Hells Bells", "Back in Black", "You Shook Me All Night Long")));
        albums.add(new Album("The Dark Side of the Moon", Arrays.asList("Money", "Us and Them", "Brain Damage")));
        albums.add(new Album("The Bodyguard", Arrays.asList("I Will Always Love You", "I Have Nothing", "Run to You")));
        albums.add(new Album("Bat Out of Hell", Arrays.asList("Bat Out of Hell", "You Took the Words Right Out of My Mouth")));
        albums.add(new Album("Their Greatest Hits (1971–1975)", Arrays.asList("Take It Easy", "Witchy Woman", "Lyin' Eyes")));
        albums.add(new Album("Saturday Night Fever", Arrays.asList("Stayin' Alive", "Night Fever", "More Than a Woman")));
        albums.add(new Album("Rumours", Arrays.asList("Go Your Own Way", "Dreams", "Don't Stop")));
        albums.add(new Album("Come On Over", Arrays.asList("Man! I Feel Like a Woman!", "You're Still the One")));
        albums.add(new Album("Led Zeppelin IV", Arrays.asList("Black Dog", "Rock and Roll", "Stairway to Heaven")));
        
        return albums;
    }
}
