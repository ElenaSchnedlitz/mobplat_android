package com.example.uebung05_hessler_schnedlitz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton zodiacHome = (ImageButton) findViewById(R.id.signsHomeButton);
        ImageButton housesHome = (ImageButton) findViewById(R.id.HousesHomeButton);
        ImageButton planetsHome = (ImageButton) findViewById(R.id.planetsHomeButton);
    }
}