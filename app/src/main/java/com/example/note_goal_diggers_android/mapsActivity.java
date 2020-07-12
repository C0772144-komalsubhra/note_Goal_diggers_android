package com.example.note_goal_diggers_android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.SupportMapFragment;

public class mapsActivity extends AppCompatActivity {
    SupportMapFragment supportMapFragment;

    String lat;
    String lon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }
}
