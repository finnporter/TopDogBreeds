package com.example.finn.androidstudiodogbreeds;

/**
 * Created by Finn on 05/07/2017.
 */

public class DogBreed {

    private int ranking;
    private String breed;
    private String size;

    public DogBreed(Integer ranking, String breed, String size) {
        this.ranking = ranking;
        this.breed = breed;
        this.size = size;
    }

    public Integer getRanking() { return ranking; }

    public String getBreed() { return breed; }

    public String getSize() { return size; }
}
