package com.example.android.dublin_ireland;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter
     *                is being created in.
     * @param places  is the list of {@link Place} to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        final Place currentPlace = getItem(position);

        // Find the TextView in the list_items.xml layout with the ID name_text_view.
        TextView name = (TextView) listItemView.findViewById(R.id.name_text_view);

        // Get the name of the place from the currentPlace object and set this text on name.
        name.setText(currentPlace.getPlaceName());

        // Find the TextView in the list_items.xml layout with the ID address_text_view.
        TextView address = (TextView) listItemView.findViewById(R.id.address_text_view);

        // Get the address of the place from the currentPlace object and set this text on address.
        address.setText(currentPlace.getPlaceAddress());

        // Find the ImageView in the list_items.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        // Check if an image is provided for that place or not
        if (currentPlace.hasImage()) {

            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageResourceId());

            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);

        } else {

            // Otherwise hide the ImageView
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews & 1 ImageView)
        // so that it can be shown in the ListView.
        return listItemView;
    }
}
