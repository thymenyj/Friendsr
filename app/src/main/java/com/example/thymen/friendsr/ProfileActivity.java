package com.example.thymen.friendsr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // get friend variables
        Intent intent = getIntent();
        Friend retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");

        // set visual id
        TextView name = findViewById(R.id.profileName);
        ImageView picture = findViewById(R.id.profilePicture);
        TextView bio = findViewById(R.id.profileBio);
        RatingBar rating = findViewById(R.id.profileRating);

        // show the right values
        name.setText(retrievedFriend.getName());
        picture.setImageResource(retrievedFriend.getDrawableId());
        bio.setText(retrievedFriend.getBio());
        rating.setRating(retrievedFriend.getRating());

        // check value of the sharedpreferences and show stored rating
        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
        Float number = prefs.getFloat("settings", 0);
        if (number != null) {
            rating.setRating(number);
        }
        else {
            rating.setRating(0);
        }
        rating.setOnRatingBarChangeListener(new OnRatingBarChangeListener());
    }

    // changes the value of ratingbar in sharedpreference
    public class OnRatingBarChangeListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putFloat("settings", rating);
            editor.apply();
        }
    }

}
