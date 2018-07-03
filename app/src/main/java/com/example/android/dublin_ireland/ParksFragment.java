package com.example.android.dublin_ireland;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.general_list, container, false);

        // Create a list of places
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.name_park1),getResources().getString(R.string.address_park1), R.drawable.stephens_green));
        places.add(new Place(getResources().getString(R.string.name_park2),getResources().getString(R.string.address_park2), R.drawable.annes_park));
        places.add(new Place(getResources().getString(R.string.name_park3),getResources().getString(R.string.address_park3), R.drawable.phoenix_park));
        places.add(new Place(getResources().getString(R.string.name_park4),getResources().getString(R.string.address_park4), R.drawable.corkagh_park));
        places.add(new Place(getResources().getString(R.string.name_park5),getResources().getString(R.string.address_park5), R.drawable.herbert_park));
        places.add(new Place(getResources().getString(R.string.name_park6),getResources().getString(R.string.address_park6), R.drawable.fairview_park));
        places.add(new Place(getResources().getString(R.string.name_park7),getResources().getString(R.string.address_park7), R.drawable.marlay_park));


        //Create an PlaceAdapter, whose data source is a list of places.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the PlaceAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}
