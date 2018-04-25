package com.example.thymen.friendsr;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FriendsAdapter extends ArrayAdapter<Friend> {

    private ArrayList<Friend> friends;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Friend person = friends.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }
        TextView name = convertView.findViewById(R.id.name);
        ImageView picture = convertView.findViewById(R.id.picture);


        name.setText(person.getName());
        picture.setImageResource(person.getDrawableId());
        return convertView;
    }

    public FriendsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Friend> objects) {
        super(context, resource, objects);

        friends = objects;

    }

}
