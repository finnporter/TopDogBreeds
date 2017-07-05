package com.example.finn.androidstudiodogbreeds;

import java.util.ArrayList;

/**
 * Created by Finn on 05/07/2017.
 */

public class TopDogBreeds {

    private ArrayList<DogBreed> list;

    public TopDogBreeds() {
        list = new ArrayList<DogBreed>();
        list.add(new DogBreed(1, "Mini American Shepherd", "medium"));
        list.add(new DogBreed(2, "Australian Shepherd", "large"));
        list.add(new DogBreed(3, "Tibetan Terrier", "medium"));
        list.add(new DogBreed(4, "Border Collie", "large"));
        list.add(new DogBreed(5, "Puli", "medium"));
        list.add(new DogBreed(6, "Jack Russell", "small"));
        list.add(new DogBreed(7, "Skye Terrier", "small"));
        list.add(new DogBreed(8, "Alaskan Malamute", "large"));
        list.add(new DogBreed(9, "Bichon Havanais", "small"));
        list.add(new DogBreed(10, "Cardigan Welch Corgi", "small"));
        list.add(new DogBreed(11, "Scottish Deerhoud", "extra large"));
        list.add(new DogBreed(12, "Manchester Terrier", "medium"));
        list.add(new DogBreed(13, "Nova Scotia Duck Trolling Retriever", "large"));
        list.add(new DogBreed(14, "Greenland Dog", "large"));
        list.add(new DogBreed(15, "Lhasa Apso", "small"));
        list.add(new DogBreed(16, "Chihuahua", "extra small"));
        list.add(new DogBreed(17, "Bull Terrier", "medium"));
        list.add(new DogBreed(18, "Bearded Collie", "medium"));
        list.add(new DogBreed(19, "Bobtail", "large"));
        list.add(new DogBreed(20, "Komondor", "large"));
    }

    public ArrayList<DogBreed> getList() { return new ArrayList<DogBreed>(list);}
}
