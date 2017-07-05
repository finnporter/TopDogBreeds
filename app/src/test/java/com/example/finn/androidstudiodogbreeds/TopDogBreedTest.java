package com.example.finn.androidstudiodogbreeds;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Finn on 05/07/2017.
 */

public class TopDogBreedTest {

    @Test
    public void hasList() {
        TopDogBreeds topDogBreeds = new TopDogBreeds();
        assertEquals(20, topDogBreeds.getList().size());
    }
}
