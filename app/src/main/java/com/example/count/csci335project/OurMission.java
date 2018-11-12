package com.example.count.csci335project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OurMission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_mission);
    }

    /** Called when the user clicks the "Donate" button (to navigate to donation screen) */
    public void goToDonateScreen(View view) {
        Intent intent = new Intent(this, DonateActivity.class);
        startActivity(intent);
    }
}
