package com.example.thymen.friendsr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // array with all friends
    ArrayList<Friend> friends = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adding friends to list
        int id = getResources().getIdentifier("arya", "drawable", getPackageName());
        friends.add(new Friend("Ayra", "Girl", id));
        int id2 = getResources().getIdentifier("cersei", "drawable", getPackageName());
        friends.add(new Friend("Cersei", "Girl", id2));
        int id3 = getResources().getIdentifier("daenerys", "drawable", getPackageName());
        friends.add(new Friend("Daenerys", "Girl", id3));
        int id4 = getResources().getIdentifier("jaime", "drawable", getPackageName());
        friends.add(new Friend("Jaime", "Guy", id4));
        int id5 = getResources().getIdentifier("jon", "drawable", getPackageName());
        friends.add(new Friend("Jon", "Guy", id5));
        int id6 = getResources().getIdentifier("jorah", "drawable", getPackageName());
        friends.add(new Friend("Jorah", "Guy", id6));
        int id7 = getResources().getIdentifier("margaery", "drawable", getPackageName());
        friends.add(new Friend("Margaery", "Girl", id7));
        int id9 = getResources().getIdentifier("sansa", "drawable", getPackageName());
        friends.add(new Friend("Sansa", "Girl", id9));
        int id10 = getResources().getIdentifier("tyrion", "drawable", getPackageName());
        friends.add(new Friend("Tyrion", "Guy", id10));

        // get gridView to connect the adapter and griditemclicklistener to the grid
        GridView gridView = findViewById(R.id.simpleGrid);

        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);
        gridView.setAdapter(adapter);

        GridItemClickListener click = new GridItemClickListener();
        gridView.setOnItemClickListener(click);


    }

    private class GridItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // check what friend is clicked
            Friend clickedFriend = (Friend) parent.getItemAtPosition(position);

            // push the variables of the friend to the provileactivity
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("clicked_friend", clickedFriend);
            startActivity(intent);
        }
    }


}


