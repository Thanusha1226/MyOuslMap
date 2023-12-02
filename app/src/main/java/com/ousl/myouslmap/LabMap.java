package com.ousl.myouslmap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ousl.myouslmap.databinding.ActivityLabMapBinding;

public class LabMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap1,mMap2,mMap3,mMap4,mMap5,mMap6,mMap7,mMap8,mMap9;
    private ActivityLabMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLabMapBinding.inflate(getLayoutInflater());
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

        // add location for Textile And Apparel Tech lab
        mMap1 = googleMap;
        LatLng TextTile = new LatLng(6.88274426387322, 79.88471335888877);
        mMap1.addMarker(new MarkerOptions().position(TextTile).title("TexTile And Apparel Tech Lab"));
        mMap1.moveCamera(CameraUpdateFactory.newLatLngZoom(TextTile, 30.0f));

        // locaton for Industrial Automation And Mechanical Eng Lab"
        mMap2 = googleMap;
        LatLng IndustAuto = new LatLng(6.883500874153929, 79.88576183011017);
        mMap2.addMarker(new MarkerOptions().position(IndustAuto).title("Industrial Automation And Mechanical Eng Lab"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(IndustAuto, 30.0f));

        // Location for Mechanical Eng Workshop
        mMap3 = googleMap;
        LatLng MacW = new LatLng(6.883708293631834, 79.88587027997788);
        mMap3.addMarker(new MarkerOptions().position(MacW).title("Mechanical Eng Workshop"));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(MacW, 30.0f));


        // Location For Computer Science Lab
        mMap4 = googleMap;
        LatLng ComSL = new LatLng(6.883748450403758, 79.8849911359755);
        mMap4.addMarker(new MarkerOptions().position(ComSL).title("Computer Science Lab"));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(ComSL, 30.0f));


        // Location For Department Of Civil Eng Lab
        mMap5 = googleMap;
        LatLng DepOfCivilEngLab = new LatLng(6.883596666565002, 79.88477924146692);
        mMap5.addMarker(new MarkerOptions().position(DepOfCivilEngLab).title("Department Of Civil Eng Lab"));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(DepOfCivilEngLab, 30.0f));


        // Location for Center for Environment Studies
        mMap6 = googleMap;
        LatLng CFES = new LatLng(6.883169706472252, 79.88473104471274);
        mMap6.addMarker(new MarkerOptions().position(CFES).title("Center for Environment Studies"));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(CFES, 30.0f));

        // location for Automotive Lab
        mMap7 = googleMap;
        LatLng AutoLab = new LatLng(6.883907343867573, 79.88375863176998);
        mMap7.addMarker(new MarkerOptions().position(AutoLab).title("Automotive Lab"));
        mMap7.moveCamera(CameraUpdateFactory.newLatLngZoom(AutoLab, 30.0f));

        // Location for Automobile Lab
        mMap8 = googleMap;
        LatLng AutoMLab = new LatLng(6.883775531633756, 79.88373180968028);
        mMap8.addMarker(new MarkerOptions().position(AutoMLab).title("Automobile Lab"));
        mMap8.moveCamera(CameraUpdateFactory.newLatLngZoom(AutoMLab, 30.0f));

        // Location For Computer Lab
        mMap9 = googleMap;
        LatLng ComLab = new LatLng(6.88672048988847, 79.88159243760231);
        mMap9.addMarker(new MarkerOptions().position(ComLab).title("Computer Lab"));
        mMap9.moveCamera(CameraUpdateFactory.newLatLngZoom(ComLab, 30.0f));

    }
}