package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab extends AppCompatActivity {
Button next1,next2, next3, next4, next5, next6, next7, next8, next9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab);
        next1 =(Button) findViewById(R.id.cartbutton1);
        next2 =(Button) findViewById(R.id.cartbutton2);
        next3=(Button) findViewById(R.id.cartbutton3);
        next4 =(Button)findViewById(R.id.cartbutton4);
        next5 =(Button) findViewById(R.id.cartbutton5);
        next6 = (Button)findViewById(R.id.cartbutton6);
        next7 = (Button) findViewById(R.id.cartbutton7);
        next8 = (Button) findViewById(R.id.cartbutton8);
        next9 =(Button) findViewById(R.id.cartbutton9);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLab();
            }
        });
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLab();
            }
        });
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLab();
            }
        });
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLab();
            }
        });
        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLab();
            }
        });
        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLab();
            }
        });
        next7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLab();
            }
        });
        next8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLab();
            }
        });

        next9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapLab();
            }
        });
    }
    public void mapLab(){
        Intent intent  = new Intent(Lab.this, LabMap.class);
        startActivity(intent);
    }
}