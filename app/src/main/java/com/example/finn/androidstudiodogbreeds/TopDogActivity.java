package com.example.finn.androidstudiodogbreeds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopDogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_dog);

        TopDogBreeds topDogBreeds = new TopDogBreeds();

        ArrayList<DogBreed> list = topDogBreeds.getList();

        TopDogBreedsAdapter dogBreedsAdapter = new TopDogBreedsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(dogBreedsAdapter);
    }

    public void getDogBreed(View listItem) {
        DogBreed dogBreed = (DogBreed) listItem.getTag();
        Log.d(getClass().toString(), dogBreed.getBreed());
    }
}
