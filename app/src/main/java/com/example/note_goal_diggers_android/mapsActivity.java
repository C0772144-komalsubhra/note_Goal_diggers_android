package com.example.note_goal_diggers_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class mapsActivity extends AppCompatActivity {
    SupportMapFragment supportMapFragment;

    String lat;
    String lon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps); supportMapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.google_map);

        Intent i = getIntent();
        lat = i.getExtras().getString("notelat");
        lon = i.getExtras().getString("notelon");

        getcurrentLoaction();


    }

    private void getcurrentLoaction() {

        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                LatLng latLng = new LatLng(Double.parseDouble(lat),Double.parseDouble(lon));

                MarkerOptions options = new MarkerOptions().position(latLng).title("im  here");

                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,10));

                googleMap.addMarker(options);
            }
        });


    }


}
