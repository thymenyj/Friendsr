package com.example.thymen.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ArrayList<Friend> friends = new ArrayList<Friend>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        friends.add("Ayra", "Girl", 1);
        friends.add("Cersei", "Girl", 1);
        friends.add("Daenerys", "Girl", 1);
        friends.add("Jaime", "Guy", 1);
        friends.add("Jon", "Guy", 1);
        friends.add("Jorah", "Guy", 1);
        friends.add("Margaery", "Girl", 1);
        friends.add("Melisandre", "Girl", 1);
        friends.add("Sansa", "Girl", 1);
        friends.add("Tyrion", "Guy", 1);


        for (int i = 0; i < 10; i++) {
            friends.add(Friend.name, )
        }
        getResources().getIdentifier();
    }


}
