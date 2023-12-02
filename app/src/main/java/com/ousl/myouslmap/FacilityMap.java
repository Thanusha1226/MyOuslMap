package com.ousl.myouslmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ousl.myouslmap.databinding.ActivityFacilityMapBinding;

public class FacilityMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap,mMap2,mMap3,mMap4,mMap5,mMap6,mMap7,mMap8;
    private ActivityFacilityMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFacilityMapBinding.inflate(getLayoutInflater());
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
        // add a location OUSL pre school
        mMap = googleMap;
        LatLng preSchool = new LatLng(6.882716279122176, 79.88380351033645);
        mMap.addMarker(new MarkerOptions().position(preSchool).title("Pre school, OUSL"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(preSchool,50.0f));

        // add a location printing press
        mMap2 = googleMap;
        LatLng printingPress = new LatLng(-6.883202392196037, 79.88400083796428);
        mMap2.addMarker(new MarkerOptions().position(printingPress).title("Printing Press Open University"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(printingPress,50.0f));

        // add a location Medical center
        mMap3 = googleMap;
        LatLng medCenter = new LatLng(6.883159084612235, 79.88359875705142);
        mMap3.addMarker(new MarkerOptions().position(medCenter).title("Medical Center and staff Day care"));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(medCenter,50.0f));

        // add a location OUSL press
        mMap4 = googleMap;
        LatLng press = new LatLng(6.883551475031058, 79.88400262205455);
        mMap4.addMarker(new MarkerOptions().position(press).title("The Open University Sri Lanka Press"));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(press, 50.0f));

        // add a location Course Material Distribution Centre
        mMap5 = googleMap;
        LatLng CourseMetDis = new LatLng(6.883537167678851, 79.88375842249845);
        mMap5.addMarker(new MarkerOptions().position(CourseMetDis).title("Course Material Distribution Centre"));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(CourseMetDis,50.0f));

        // add a location budu madura
        mMap6 = googleMap;
        LatLng BuduMadura = new LatLng(6.883529635930575, 79.88347962111663);
        mMap6.addMarker(new MarkerOptions().position(BuduMadura).title("Open University Budu Medura"));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(BuduMadura, 50.0f));

        // add a location media house
        mMap7 = googleMap;
        LatLng mediaHouse = new LatLng(6.885707114894473, 79.88316617114936);
        mMap7.addMarker(new MarkerOptions().position(mediaHouse).title("OUSL Media House"));
        mMap7.moveCamera(CameraUpdateFactory.newLatLngZoom(mediaHouse,50.0f));

        // add a location library
        mMap8 = googleMap;
        LatLng Library = new LatLng(6.886402285173979, 79.88291869942545);
        mMap8.addMarker(new MarkerOptions().position(Library).title("The Library of Open University of Sri Lanka"));
        mMap8.moveCamera(CameraUpdateFactory.newLatLngZoom(Library,50.0f));
    }
}