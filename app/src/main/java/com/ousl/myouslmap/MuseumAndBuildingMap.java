package com.ousl.myouslmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ousl.myouslmap.databinding.ActivityMuseumAndBuildingMapBinding;

public class MuseumAndBuildingMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap,mMap2,mMap3,mMap4,mMap5,mMap6, mMap7;
    private ActivityMuseumAndBuildingMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMuseumAndBuildingMapBinding.inflate(getLayoutInflater());
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

        // Add a marker in Location and move the camera
        LatLng ZooLogy = new LatLng(6.883155084012264, 79.88458687761347);
        mMap.addMarker(new MarkerOptions().position(ZooLogy).title("Zoology biodiversity"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ZooLogy,40.0f));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ZooLogy));

        mMap2 = googleMap;

        // Add a marker in Location and move the camera
        LatLng hhsBuild = new LatLng(6.886966882372512, 79.88228803203415);
        mMap2.addMarker(new MarkerOptions().position(hhsBuild).title("HHS Building"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(hhsBuild,40.0f));
        mMap2.moveCamera(CameraUpdateFactory.newLatLng(hhsBuild));

        mMap3 = googleMap;

        // Add a marker in Location and move the camera
        LatLng adminBuild = new LatLng(6.887397347758316, 79.88204500230572);
        mMap3.addMarker(new MarkerOptions().position(adminBuild).title("Admin Building"));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(adminBuild,40.0f));
        mMap3.moveCamera(CameraUpdateFactory.newLatLng(adminBuild));

        mMap4 = googleMap;

        // Add a marker in Location and move the camera
        LatLng oldHost = new LatLng(6.886991605831905, 79.88159299807847);
        mMap4.addMarker(new MarkerOptions().position(oldHost).title("Old Hostel"));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(oldHost,40.0f));
        mMap4.moveCamera(CameraUpdateFactory.newLatLng(oldHost));

        mMap5 = googleMap;

        // Add a marker in Location and move the camera
        LatLng guestHouse = new LatLng(6.886853421602272, 79.88062470563784);
        mMap5.addMarker(new MarkerOptions().position(guestHouse).title("Guest House"));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(guestHouse,40.0f));
        mMap5.moveCamera(CameraUpdateFactory.newLatLng(guestHouse));

        mMap6 = googleMap;

        // Add a marker in Location and move the camera
        LatLng newHost = new LatLng(6.888378444965761, 79.87941439819576);
        mMap6.addMarker(new MarkerOptions().position(newHost).title("New Hostel"));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(newHost,40.0f));
        mMap6.moveCamera(CameraUpdateFactory.newLatLng(newHost));

        mMap7 = googleMap;

        // Add a marker in Location and move the camera
        LatLng trF = new LatLng(6.88840240746312, 79.87936807793467);
        mMap7.addMarker(new MarkerOptions().position(trF).title("New Hostel"));
        mMap7.moveCamera(CameraUpdateFactory.newLatLngZoom(trF,40.0f));
        mMap7.moveCamera(CameraUpdateFactory.newLatLng(trF));
    }
}