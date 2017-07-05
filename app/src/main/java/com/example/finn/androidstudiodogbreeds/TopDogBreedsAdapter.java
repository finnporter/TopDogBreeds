package com.example.finn.androidstudiodogbreeds;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Finn on 05/07/2017.
 */

class TopDogBreedsAdapter extends ArrayAdapter<DogBreed> {

    public TopDogBreedsAdapter(Context context, ArrayList<DogBreed> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.dogbreed_item, parent, false);
        }

        DogBreed currentDogBreed = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentDogBreed.getRanking().toString());

        TextView breed = (TextView) listItemView.findViewById(R.id.breed);
        breed.setText(currentDogBreed.getBreed().toString());

        TextView size = (TextView) listItemView.findViewById(R.id.size);
        size.setText(currentDogBreed.getSize().toString());

        listItemView.setTag(currentDogBreed);

        return listItemView;


    }
}
