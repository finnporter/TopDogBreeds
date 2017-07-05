package com.example.finn.androidstudiodogbreeds;

import android.graphics.drawable.Drawable;

/**
 * Created by Finn on 05/07/2017.
 */

public class DogBreed {

    private int ranking;
    private String breed;
    private String size;
    private int img;

    public DogBreed(Integer ranking, String breed, String size, Integer img) {
        this.ranking = ranking;
        this.breed = breed;
        this.size = size;
        this.img = img;
    }

    public Integer getRanking() { return ranking; }

    public String getBreed() { return breed; }

    public String getSize() { return size; }

    public Integer getImg() { return img;}
}
