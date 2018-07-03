package com.example.android.dublin_ireland;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.general_list, container, false);

        // Create a list of places
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.name_museum1),getResources().getString(R.string.address_museum1), R.drawable.kilmainham_gaol));
        places.add(new Place(getResources().getString(R.string.name_museum2),getResources().getString(R.string.address_museum2), R.drawable.croke_park));
        places.add(new Place(getResources().getString(R.string.name_museum3),getResources().getString(R.string.address_museum3), R.drawable.irish_whiskey));
        places.add(new Place(getResources().getString(R.string.name_museum4),getResources().getString(R.string.address_museum4), R.drawable.glasnevin_cemetery));
        places.add(new Place(getResources().getString(R.string.name_museum5),getResources().getString(R.string.address_museum5), R.drawable.irish_rock_n_roll));
        places.add(new Place(getResources().getString(R.string.name_museum6),getResources().getString(R.string.address_museum6), R.drawable.dublinia));
        places.add(new Place(getResources().getString(R.string.name_museum7),getResources().getString(R.string.address_museum7), R.drawable.national_leprechaun));

        //Create an PlaceAdapter, whose data source is a list of places.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the PlaceAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}
