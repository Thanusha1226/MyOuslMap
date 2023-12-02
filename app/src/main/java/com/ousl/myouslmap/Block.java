package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Block extends AppCompatActivity {

    Button  nextPage1, nextPage2, nextPage3, nextPage4, nextPage5, nextPage6, nextPage7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block);
        nextPage1 = (Button) findViewById(R.id.cartbutton1);
        nextPage2 = (Button) findViewById(R.id.cartbutton2);
        nextPage3 = (Button) findViewById(R.id.cartbutton3);
        nextPage4 = (Button) findViewById(R.id.cartbutton4);
        nextPage5 = (Button) findViewById(R.id.cartbutton5);
        nextPage6 =(Button) findViewById(R.id.cartbutton6);
        nextPage7 = (Button) findViewById(R.id.cartbutton7);

        nextPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map();
            }
        });
        nextPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map();
            }
        });
        nextPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map();
            }
        });
        nextPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map();
            }
        });
        nextPage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map();
            }
        });
        nextPage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map();
            }
        });
        nextPage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map();
            }
        });

    }
    public void map(){
        Intent intent = new Intent(Block.this, BlockMap.class);
        startActivity(intent);
    }
}