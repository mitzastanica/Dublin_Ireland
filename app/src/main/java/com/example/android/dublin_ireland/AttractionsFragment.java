package com.example.android.dublin_ireland;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.general_list, container, false);

        // Create a list of places
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.name_attraction1),getResources().getString(R.string.address_attraction1), R.drawable.christ_church));
        places.add(new Place(getResources().getString(R.string.name_attraction2),getResources().getString(R.string.address_attraction2), R.drawable.glendalough_and_powerscourt));
        places.add(new Place(getResources().getString(R.string.name_attraction3),getResources().getString(R.string.address_attraction3), R.drawable.guinness_storehouse));
        places.add(new Place(getResources().getString(R.string.name_attraction4),getResources().getString(R.string.address_attraction4), R.drawable.howth));
        places.add(new Place(getResources().getString(R.string.name_attraction5),getResources().getString(R.string.address_attraction5), R.drawable.malahide_castle));
        places.add(new Place(getResources().getString(R.string.name_attraction6),getResources().getString(R.string.address_attraction6), R.drawable.viking_duck_tour));

        //Create an PlaceAdapter, whose data source is a list of places.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the PlaceAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}
