package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DepDiviAndUnit extends AppCompatActivity {
    Button next1, next2, next3, next4, next5, next6, next7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep_divi_and_unit);
        next1 =(Button) findViewById(R.id.cartbutton1);
        next2 = (Button) findViewById(R.id.cartbutton2);
        next3 = (Button) findViewById(R.id.cartbutton3);
        next4 = (Button) findViewById(R.id.cartbutton4);
        next5 = (Button) findViewById(R.id.cartbutton5);
        next6 = (Button) findViewById(R.id.cartbutton6);
        next7 = (Button) findViewById(R.id.cartbutton7);

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

    }
    public  void nextPage(){
        Intent intent = new Intent(DepDiviAndUnit.this, DepDiviAndUniMap.class);
        startActivity(intent);
    }
}