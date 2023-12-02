package com.ousl.myouslmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ousl.myouslmap.databinding.ActivityDepDiviAndUniMapBinding;

public class DepDiviAndUniMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap1, mMap2, mMap3, mMap4, mMap5, mMap6, mMap7;
    private ActivityDepDiviAndUniMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDepDiviAndUniMapBinding.inflate(getLayoutInflater());
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

        //add location Department of Mathematics and Computer Science
        mMap1 = googleMap;
        LatLng DepMath = new LatLng(6.884559634843883, 79.88382713168593);
        mMap1.addMarker(new MarkerOptions().position(DepMath).title("Department of Mathematics and Computer Science/ ගණිතය සහ පරිගණක විද්යා දෙපාර්තමේන්තුව"));
        mMap1.moveCamera(CameraUpdateFactory.newLatLngZoom(DepMath,50.0f));

        // Add a location IT Division
        mMap2 = googleMap;
        LatLng ItDiv = new LatLng(6.887151483512132, 79.8824408031749);
        mMap2.addMarker(new MarkerOptions().position(ItDiv).title("IT Division"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(ItDiv,50.0f));

        // add a location Research Unit
        mMap3 = googleMap;
        LatLng ResearchUnit = new LatLng(6.8872793005275925, 79.88236704242895);
        mMap3.addMarker(new MarkerOptions().position(ResearchUnit).title("Research Unit"));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(ResearchUnit,50.0f));

        // add a location estabilish division
        mMap4 = googleMap;
        LatLng StabDiv = new LatLng(6.8876085546140935, 79.88197973383234);
        mMap4.addMarker(new MarkerOptions().position(StabDiv).title("Establishment Division"));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(StabDiv,50.0f));

        //add a location Landscape Division
        mMap5 = googleMap;
        LatLng LandDiv = new LatLng(6.8876544196694605, 79.88064042545257);
        mMap5.addMarker(new MarkerOptions().position(LandDiv).title("Landscape Division"));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(LandDiv,50.0f));

        // add a location  Land and building Department
        mMap6 = googleMap;
        LatLng LandAndBuilDep = new LatLng(6.8868734041264865, 79.88104028847167);
        mMap6.addMarker(new MarkerOptions().position(LandAndBuilDep).title(" Land And Building Department"));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(LandAndBuilDep,50.0f));

        // Add a location a Maintain Division
        mMap7 = googleMap;
        LatLng MaintainDiv = new LatLng(6.8867782386950935, 79.88097149694852);
        mMap7.addMarker(new MarkerOptions().position(MaintainDiv).title("Maintain Division"));
        mMap7.moveCamera(CameraUpdateFactory.newLatLngZoom(MaintainDiv,50.0f));
    }
}