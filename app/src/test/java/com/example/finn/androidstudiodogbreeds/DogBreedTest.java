package com.example.finn.androidstudiodogbreeds;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Finn on 05/07/2017.
 */

public class DogBreedTest {

    DogBreed dogBreed;

    @Before
    public void before() {
        dogBreed = new DogBreed(54, "Schnauzer", "small");
    }

    @Test
    public void hasRanking() {
        assertEquals(54, dogBreed.getRanking());
    }

    @Test
    public void hasBreed() {
        assertEquals("Schnauzer", dogBreed.getBreed());
    }

    @Test
    public void hasSize() {
        assertEquals("small", dogBreed.getSize());
    }
}
