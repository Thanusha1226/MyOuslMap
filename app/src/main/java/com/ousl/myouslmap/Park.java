package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Park extends AppCompatActivity {
    Button StdnCar, AdminCar, StudentVehi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
        StudentVehi= (Button) findViewById(R.id.Carparkbttn1);
        AdminCar = (Button) findViewById(R.id.Carparkbttn2);
        StdnCar = (Button) findViewById(R.id.Carparkbuttn3);

        StudentVehi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MapCarPark();
            }
        });

        AdminCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MapCarPark();
            }
        });

        StdnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MapCarPark();
            }
        });

    }
    public void MapCarPark(){
        Intent intent = new Intent(Park.this, ParkMap.class);
        startActivity(intent);
    }
}