package com.example.finn.androidstudiodogbreeds;

import java.util.ArrayList;

/**
 * Created by Finn on 05/07/2017.
 */

public class TopDogBreeds {

    private ArrayList<DogBreed> list;

    public TopDogBreeds() {
        list = new ArrayList<DogBreed>();
        list.add(new DogBreed(1, "Mini American Shepherd", "medium", R.drawable.img01));
        list.add(new DogBreed(2, "Australian Shepherd", "large", R.drawable.img02));
        list.add(new DogBreed(3, "Tibetan Terrier", "medium", R.drawable.img01));
        list.add(new DogBreed(4, "Border Collie", "large", R.drawable.img02));
        list.add(new DogBreed(5, "Puli", "medium", R.drawable.img02));
        list.add(new DogBreed(6, "Jack Russell", "small", R.drawable.img01));
        list.add(new DogBreed(7, "Skye Terrier", "small", R.drawable.img02));
        list.add(new DogBreed(8, "Alaskan Malamute", "large", R.drawable.img02));
        list.add(new DogBreed(9, "Bichon Havanais", "small", R.drawable.img02));
        list.add(new DogBreed(10, "Cardigan Welch Corgi", "small", R.drawable.img02));
        list.add(new DogBreed(11, "Scottish Deerhoud", "extra large", R.drawable.img01));
        list.add(new DogBreed(12, "Manchester Terrier", "medium", R.drawable.img02));
        list.add(new DogBreed(13, "Nova Scotia Duck Trolling Retriever", "large", R.drawable.img01));
        list.add(new DogBreed(14, "Greenland Dog", "large", R.drawable.img02));
        list.add(new DogBreed(15, "Lhasa Apso", "small", R.drawable.img02));
        list.add(new DogBreed(16, "Chihuahua", "extra small", R.drawable.img02));
        list.add(new DogBreed(17, "Bull Terrier", "medium", R.drawable.img02));
        list.add(new DogBreed(18, "Bearded Collie", "medium", R.drawable.img02));
        list.add(new DogBreed(19, "Bobtail", "large", R.drawable.img02));
        list.add(new DogBreed(20, "Komondor", "large", R.drawable.img02));
    }

    public ArrayList<DogBreed> getList() { return new ArrayList<DogBreed>(list);}
}
