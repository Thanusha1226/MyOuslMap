package com.ousl.myouslmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ousl.myouslmap.databinding.ActivityExameHallMapBinding;

public class ExameHallMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap,mMap2,mMap3,mMap4,mMap5;
    private ActivityExameHallMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityExameHallMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        // add a location Exam hall 01
        mMap = googleMap;
        LatLng hall1 = new LatLng(6.883684722711299, 79.88421900038107);
        mMap.addMarker(new MarkerOptions().position(hall1).title("Exam Hall 01"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hall1,50.0f));

        // add a location exam hall 02
        mMap2 = googleMap;
        LatLng Hall2 = new LatLng(6.88343900607448, 79.88426208080193);
        mMap2.addMarker(new MarkerOptions().position(Hall2).title("Exam Hall 02"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(Hall2,50.0f));

        // add a location Exam hall 03
        mMap3 = googleMap;
        LatLng Hall03 = new LatLng(6.885124310868214, 79.88335962637592);
        mMap3.addMarker(new MarkerOptions().position(Hall03).title("Exam Hall 03"));
        mMap3.moveCamera(CameraUpdateFactory.newLatLng(Hall03));

        // add a location  Exam hall 04
        mMap4 = googleMap;
        LatLng Hall04 = new LatLng(6.888051516992149, 79.87979032967135);
        mMap4.addMarker(new MarkerOptions().position(Hall04).title("Exam Hall 04"));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(Hall04,50.0f));

        // add a location exam hall 23
        mMap5 = googleMap;
        LatLng Hall23 = new LatLng(6.885153884037221, 79.88360098341752);
        mMap5.addMarker(new MarkerOptions().position(Hall23).title("Exam Hall 23"));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(Hall23, 50.0f));
    }
}