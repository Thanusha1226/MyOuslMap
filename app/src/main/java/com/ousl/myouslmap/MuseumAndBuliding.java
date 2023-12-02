package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MuseumAndBuliding extends AppCompatActivity {
    Button Zoology, HHSBuild, AdminBuild, OldHostel, GuestHouse, NewHostel, TRF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_and_buliding);
        Zoology =(Button) findViewById(R.id.cartbutton1);
        HHSBuild =(Button) findViewById(R.id.cartbutton2);
        AdminBuild = (Button) findViewById(R.id.cartbutton3);
        OldHostel =(Button) findViewById(R.id.cartbutton4);
        GuestHouse =(Button) findViewById(R.id.cartbutton5);
        NewHostel=(Button)findViewById(R.id.cartbutton6);
        TRF =(Button) findViewById(R.id.cartbutton7);

        Zoology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapMeusiumandBuild();
            }
        });
        HHSBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapMeusiumandBuild();
            }
        });
        AdminBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapMeusiumandBuild();
            }
        });
        OldHostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapMeusiumandBuild();
            }
        });
        GuestHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapMeusiumandBuild();
            }
        });
        NewHostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapMeusiumandBuild();
            }
        });
        TRF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapMeusiumandBuild();
            }
        });
    }
    public void mapMeusiumandBuild(){
        Intent intent = new Intent(MuseumAndBuliding.this, MuseumAndBuildingMap.class);
        startActivity(intent);
        Toast.makeText(this, "Move To Map Activity", Toast.LENGTH_SHORT).show();
    }
}