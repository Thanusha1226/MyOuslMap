package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Facility extends AppCompatActivity {
    Button next1, next2, next3, next4, next5, next6, next7, next8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);

        next1 = (Button) findViewById(R.id.preShoolbuttn);
        next2 = (Button) findViewById(R.id. printinPressbttn);
        next3 = (Button) findViewById(R.id.MedicalCenterbuttn);
        next4 = (Button) findViewById(R.id.Pressbttn);
        next5 = (Button) findViewById(R.id.CourseMetirialbuttn);
        next6 = (Button) findViewById(R.id.BuduMadurabttn);
        next7 = (Button) findViewById(R.id.MediaHousebttn);
        next8 = (Button) findViewById(R.id.Librarybttn);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        next7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
        next8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPage();
            }
        });
    }

    public void nextPage(){
        Intent intent = new Intent(Facility.this, FacilityMap.class);
        startActivity(intent);
    }
}