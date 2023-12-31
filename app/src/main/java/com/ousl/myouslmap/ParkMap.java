package com.ousl.myouslmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ousl.myouslmap.databinding.ActivityParkMapBinding;

public class ParkMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap, mMap2, mMap3;
    private ActivityParkMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityParkMapBinding.inflate(getLayoutInflater());
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
        mMap = googleMap;

        // Add a marker in location and move the camera
        LatLng StudenVehiPark = new LatLng(6.8828561725706, 79.88377652861905);
        mMap.addMarker(new MarkerOptions().position(StudenVehiPark).title("Student Vehicle Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(StudenVehiPark, 40.0f));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(StudenVehiPark));

        mMap2 = googleMap;

        // Add a marker in location and move the camera
        LatLng StudencarPark = new LatLng(6.88309211821369, 79.88386899231422);
        mMap2.addMarker(new MarkerOptions().position(StudencarPark).title("Student Car Park"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(StudencarPark, 40.0f));
        mMap2.moveCamera(CameraUpdateFactory.newLatLng(StudencarPark));

        mMap3 = googleMap;

        // Add a marker in location and move the camera
        LatLng AdminCarPark = new LatLng(6.886721224412957, 79.88193910421668);
        mMap3.addMarker(new MarkerOptions().position(AdminCarPark).title("Admin Car Park"));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(AdminCarPark, 40.0f));
        mMap3.moveCamera(CameraUpdateFactory.newLatLng(AdminCarPark));
    }
}