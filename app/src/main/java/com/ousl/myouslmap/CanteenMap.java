package com.ousl.myouslmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ousl.myouslmap.databinding.ActivityCanteenMapBinding;

public class CanteenMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap, mMap2, mMap3;
    private ActivityCanteenMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCanteenMapBinding.inflate(getLayoutInflater());
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

        // add location OUSL CRC canteen
        LatLng canteen = new LatLng(6.882647292612634, 79.88512840112264);
        mMap.addMarker(new MarkerOptions().position(canteen).title("Open University Colombo Regional Center Canteen / විවෘත විශ්වවිද්යාල ආපන ශාලාව "));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(canteen,50.0f));

        // add  Location OUSL milk Bar
        mMap2 = googleMap;
        LatLng milkBar = new LatLng(6.883594444854111, 79.884321604414);
        mMap2.addMarker(new MarkerOptions().position(milkBar).title("Open University Milk Bar"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(milkBar,50.0f));

        // add location dote canteen
        mMap3 = googleMap;
        LatLng doteCanteen = new LatLng(6.887222597965563, 79.88088800570962);
        mMap3.addMarker(new MarkerOptions().position(doteCanteen).title("OUSL Narahenpita Gate Canteen"));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(doteCanteen,50.0f));
    }
}