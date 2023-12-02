package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExameHall extends AppCompatActivity {
    Button next1, next2, next3, next4, next5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exame_hall);

        next1 = (Button) findViewById(R.id.cartbutton1);
        next2= (Button) findViewById(R.id.cartbutton2);
        next3 = (Button) findViewById(R.id.cartbutton3);
        next4 = (Button) findViewById(R.id.cartbutton4);
        next5 = (Button) findViewById(R.id.cartbutton5);

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

    }

    public void nextPage(){
        Intent intent = new Intent(ExameHall.this, ExameHallMap.class);
        startActivity(intent);
    }
}