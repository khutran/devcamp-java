package com.devcamp.music.service;

import com.devcamp.music.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ComposerService {
    public ArrayList<Composer> getAllComposers() {
        ArrayList<Composer> composers = new ArrayList<>();
        
        // 3 Artists
        composers.add(new Artist("Michael", "Jackson", "King of Pop", Arrays.asList(
            new Album("Thriller", Arrays.asList("Thriller", "Beat It")),
            new Album("Bad", Arrays.asList("Bad", "Smooth Criminal"))
        )));
        
        composers.add(new Artist("Freddie", "Mercury", "Freddie", Arrays.asList(
            new Album("A Night at the Opera", Arrays.asList("Bohemian Rhapsody")),
            new Album("News of the World", Arrays.asList("We Will Rock You"))
        )));
        
        composers.add(new Artist("David", "Bowie", "Ziggy Stardust", Arrays.asList(
            new Album("Heroes", Arrays.asList("Heroes")),
            new Album("Let's Dance", Arrays.asList("Let's Dance"))
        )));

        // 6 BandMembers
        BandMember bm1 = new BandMember("John", "Lennon", "John", "Guitar");
        BandMember bm2 = new BandMember("Paul", "McCartney", "Paul", "Bass");
        BandMember bm3 = new BandMember("George", "Harrison", "George", "Lead Guitar");
        BandMember bm4 = new BandMember("Ringo", "Starr", "Ringo", "Drums");
        BandMember bm5 = new BandMember("Mick", "Jagger", "Mick", "Vocals");
        BandMember bm6 = new BandMember("Keith", "Richards", "Keith", "Guitar");
        
        // Mix them up
        composers.add(bm1);
        composers.add(bm5);
        composers.add(bm2);
        composers.add(bm6);
        composers.add(bm3);
        composers.add(bm4);
        
        return composers;
    }

    public ArrayList<Band> getAllBands() {
        ArrayList<Band> bands = new ArrayList<>();
        
        // Band 1: The Beatles
        BandMember lennon = new BandMember("John", "Lennon", "John", "Guitar");
        BandMember mccartney = new BandMember("Paul", "McCartney", "Paul", "Bass");
        bands.add(new Band("The Beatles", Arrays.asList(lennon, mccartney), Arrays.asList(
            new Album("Abbey Road", Arrays.asList("Come Together", "Something")),
            new Album("Let It Be", Arrays.asList("Let It Be", "Get Back"))
        )));
        
        // Band 2: The Rolling Stones
        BandMember jagger = new BandMember("Mick", "Jagger", "Mick", "Vocals");
        BandMember richards = new BandMember("Keith", "Richards", "Keith", "Guitar");
        bands.add(new Band("The Rolling Stones", Arrays.asList(jagger, richards), Arrays.asList(
            new Album("Sticky Fingers", Arrays.asList("Brown Sugar")),
            new Album("Exile on Main St.", Arrays.asList("Rocks Off"))
        )));
        
        return bands;
    }
}
