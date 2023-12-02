package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Faculty extends AppCompatActivity {
Button next1, next2, next3, next4, next5, next6, next7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        next1 = (Button) findViewById(R.id.cartbutton1);
        next2 =(Button) findViewById(R.id.cartbutton2);
        next3 =(Button) findViewById(R.id.cartbutton3);
        next4 = (Button) findViewById(R.id.cartbutton4);
        next5 =(Button) findViewById(R.id.cartbutton5);
        next6 =(Button)findViewById(R.id.cartbutton6);
        next7=(Button) findViewById(R.id.cartbutton7);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapFac();
            }
        });
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapFac();
            }
        });
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapFac();
            }
        });
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapFac();
            }
        });
        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapFac();
            }
        });
        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapFac();
            }
        });
        next7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapFac();
            }
        });
    }

    public void mapFac(){
        Intent intent = new Intent(Faculty.this, Faculty.class);
        startActivity(intent);
    }
}