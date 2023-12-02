package com.ousl.myouslmap;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ousl.myouslmap.databinding.ActivityBlockMapBinding;

public class BlockMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap1, mMap2, mMap3,mMap4, mMap5, mMap6,mMap7;
    private ActivityBlockMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityBlockMapBinding.inflate(getLayoutInflater());
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
        mMap1 = googleMap;

        // Block 6 TextTile And Apparel Tech
        LatLng Block6= new LatLng(6.882742558644184, 79.88471962694699);
        mMap1.addMarker(new MarkerOptions().position(Block6).title("TextTile and Apparel Tech"));
        mMap1.moveCamera(CameraUpdateFactory.newLatLngZoom(Block6, 50.0f));

        mMap2 = googleMap;
        LatLng Block7 = new LatLng(6.883721090609167, 79.88513012065026);
        mMap2.addMarker(new MarkerOptions().position(Block7).title("Auditorium"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(Block7,50.0f));


        //Block 9
        mMap4 = googleMap;
        LatLng Block9 = new LatLng(6.883280739787271, 79.88500295062555);
        mMap4.addMarker(new MarkerOptions().position(Block9).title("Lecture Hall"));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(Block9,50.0f));

        //Block 10
        mMap5 = googleMap;
        LatLng Block10 = new LatLng(6.883007111322848, 79.8850288768001);
        mMap5.addMarker(new MarkerOptions().position(Block10).title("Lecture Hall"));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(Block10,50.0f));

        mMap6 = googleMap;
        LatLng Block19 = new LatLng(6.883057058103842, 79.88555012125548);
        mMap6.addMarker(new MarkerOptions().position(Block19).title(" Block 19"));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(Block19,50.0f));


    }
}