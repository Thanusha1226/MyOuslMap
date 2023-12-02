package com.ousl.myouslmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Canteen extends AppCompatActivity {
    Button canteen, milkBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);
        canteen = (Button) findViewById(R.id.cartbutton1);
        milkBar = (Button) findViewById(R.id.cartbutton2);

        canteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Canteen();
            }
        });
        milkBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Canteen();
            }
        });

    }
    public void Canteen(){
        Intent intent = new Intent(Canteen.this, CanteenMap.class);
        startActivity(intent);
        Toast.makeText(this, "Move Success", Toast.LENGTH_SHORT).show();
    }

}