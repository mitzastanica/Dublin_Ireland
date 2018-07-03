package com.example.android.dublin_ireland;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.general_list, container, false);

        // Create a list of places
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.name_restaurant1),getResources().getString(R.string.address_restaurant1), R.drawable.el_grito));
        places.add(new Place(getResources().getString(R.string.name_restaurant2),getResources().getString(R.string.address_restaurant2), R.drawable.lemon_jelly_cafe));
        places.add(new Place(getResources().getString(R.string.name_restaurant3),getResources().getString(R.string.address_restaurant3), R.drawable.arthurspub));
        places.add(new Place(getResources().getString(R.string.name_restaurant4),getResources().getString(R.string.address_restaurant4), R.drawable.beanhive));
        places.add(new Place(getResources().getString(R.string.name_restaurant5),getResources().getString(R.string.address_restaurant5), R.drawable.fx_buckley_steakhouse));
        places.add(new Place(getResources().getString(R.string.name_restaurant6),getResources().getString(R.string.address_restaurant6), R.drawable.old_punch_bowl));
        places.add(new Place(getResources().getString(R.string.name_restaurant7),getResources().getString(R.string.address_restaurant7), R.drawable.sophies));
        places.add(new Place(getResources().getString(R.string.name_restaurant8),getResources().getString(R.string.address_restaurant8), R.drawable.tang_cafe));
        places.add(new Place(getResources().getString(R.string.name_restaurant9),getResources().getString(R.string.address_restaurant9), R.drawable.tomahawk_steakhouse));

        //Create an PlaceAdapter, whose data source is a list of places.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the PlaceAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}