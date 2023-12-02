package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button facility, park, examHall, lab, canteen,faculty, dep,gym,block, meusiumBuil, toilate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        facility =(Button) findViewById(R.id.cartbutton1);
        park =(Button) findViewById(R.id.cartbutton2);
        examHall = (Button) findViewById(R.id.cartbutton3);
        lab =(Button) findViewById(R.id.cartbutton4);
        canteen = (Button) findViewById(R.id.cartbutton5);
        faculty =(Button) findViewById(R.id.cartbutton6);
        dep = (Button) findViewById(R.id.cartbutton7);
        gym = (Button) findViewById(R.id.cartbutton8);
        block =(Button) findViewById(R.id.cartbutton9);
        meusiumBuil =(Button) findViewById(R.id.cartbutton10);
        toilate =(Button) findViewById(R.id.cartbutton11);
        //Navigate codes for faculty
        facility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fac();
                Toast.makeText(MainActivity.this, "Move to Faculty page", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for park
        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                park1();
                Toast.makeText(MainActivity.this, "Move to Park Page", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for Examehall page
        examHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExameHall();
                Toast.makeText(MainActivity.this, "Move to Exam Hall Page", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for Lab page
        lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Labs();
                Toast.makeText(MainActivity.this, "Move To Labs Page ", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for Canteen Page
        canteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Canteens();
                Toast.makeText(MainActivity.this, "Move To Canteen Page ", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for Faculty and Institute page
        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Facultys();
                Toast.makeText(MainActivity.this, "Move to the Faculty and Institute page", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for Department and Division and Unit page
        dep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                depDivAndUni();
                Toast.makeText(MainActivity.this, "Move to Department/ Division and Unit page", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for GYM page
        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gymnastic();
                Toast.makeText(MainActivity.this, "Move to gym page ", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for Block page
        block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Blocks();
                Toast.makeText(MainActivity.this, "Move to the Block building page", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for Museum and Building page
        meusiumBuil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MeuAndBuilding();
                Toast.makeText(MainActivity.this, "Move to Museum and Building Page ", Toast.LENGTH_SHORT).show();
            }
        });
        //Navigate codes for Toilet page
        toilate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toilets();
                Toast.makeText(MainActivity.this, "Move to Toilets Page", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void fac(){
        Intent intent = new Intent(MainActivity.this, Facility.class);
        startActivity(intent);

    }
    public void park1(){
        Intent intent1 = new Intent(MainActivity.this, Park.class);
        startActivity(intent1);
    }
    public void ExameHall(){
        Intent intent2 = new Intent(MainActivity.this, ExameHall.class);
        startActivity(intent2);
    }
    public void Labs(){
        Intent intent = new Intent(MainActivity.this, Lab.class);
        startActivity(intent);
    }
    public void Canteens(){
        Intent intent4 = new Intent(MainActivity.this, Canteen.class);
        startActivity(intent4);
    }
    public void Facultys(){
        Intent intent5= new Intent(MainActivity.this, Faculty.class);
        startActivity(intent5);
    }
    public void depDivAndUni(){
        Intent intent6= new Intent(MainActivity.this, DepDiviAndUnit.class);
        startActivity(intent6);
    }
    public void Gymnastic(){
        //code here
        Intent intent = new Intent(MainActivity.this, Map.class);
        startActivity(intent);

    }
    public  void Blocks(){
        Intent intent7 = new Intent(MainActivity.this, Block.class);
        startActivity(intent7);
    }
    public void MeuAndBuilding(){
        Intent intent8 = new Intent(MainActivity.this, MuseumAndBuliding.class);
        startActivity(intent8);
    }
    public void Toilets(){
        //code here
        Intent intent9 = new Intent();
        startActivity(intent9);
    }

}