package com.ousl.myouslmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ousl.myouslmap.databinding.ActivityFacultyMapBinding;

public class FacultyMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap1,mMap2,mMap3,mMap4,mMap5,mMap6,mMap7;
    private ActivityFacultyMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFacultyMapBinding.inflate(getLayoutInflater());
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
        // Location for Faculty Of Health Science
        mMap1 = googleMap;
        LatLng HealthS = new LatLng(6.882903295221739, 79.88530229524712);
        mMap1.addMarker(new MarkerOptions().position(HealthS).title("Faculty Of Health Science"));
        mMap1.moveCamera(CameraUpdateFactory.newLatLngZoom(HealthS,30.0f));

        // Location for Faculty Of Engineering Technology
        mMap2 = googleMap;
        LatLng EngTech = new LatLng(6.8844056620760865, 79.88348798192463);
        mMap2.addMarker(new MarkerOptions().position(EngTech).title("Faculty Of Engineering Technology "));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(EngTech, 30.0f));

        // Location For Faculty Of Natural Science
        mMap3 = googleMap;
        LatLng NaturalS = new LatLng(6.8844959131383865, 79.88384044399467);
        mMap3.addMarker(new MarkerOptions().position(NaturalS).title("Faculty Of Natural Science"));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(NaturalS,30.0f));

        // Location For Faculty of Social Science
        mMap4 = googleMap;
        LatLng SocialS = new LatLng(6.88685631709638, 79.88250888222728);
        mMap4.addMarker(new MarkerOptions().position(SocialS).title("Faculty of Social Science"));
        mMap4.moveCamera(CameraUpdateFactory.newLatLng(SocialS));

        // Location For Post Graduate institute of Engineering
        mMap5 = googleMap;
        LatLng PostGradIns = new LatLng(6.888269439050032, 79.88050253434206);
        mMap5.addMarker(new MarkerOptions().position(PostGradIns).title("Post Graduate institute of Engineering"));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(PostGradIns,30.0f));

        // Location For Social Science new Building
        mMap6 = googleMap;
        LatLng newS = new LatLng(6.885031067787085, 79.8837457979152);
        mMap6.addMarker(new MarkerOptions().position(newS).title("Social Science new Building"));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(newS,30.0f));

        // Location For Social Science new Building
        mMap6 = googleMap;
        LatLng Edu = new LatLng(6.88275587385027, 79.88412259673291);
        mMap6.addMarker(new MarkerOptions().position(Edu).title("Education Faculty"));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(Edu,30.0f));
    }
}