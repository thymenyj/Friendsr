package com.example.thymen.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Friend> friends = new ArrayList<>();


//
//    int id2 = getResources().getIdentifier("cersei", "drawable", getPackageName());
//    Friend Cersei = new Friend("Cersei", "Girl", id2);
//
//    int id3 = getResources().getIdentifier("daenerys", "drawable", getPackageName());
//    Friend Daenerys = new Friend("Daenerys", "Girl", id3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);
        GridView gridView = findViewById(R.id.simpleGrid);
        gridView.setAdapter(adapter);
    }

    private class GridItemClickListener {

    }
}


