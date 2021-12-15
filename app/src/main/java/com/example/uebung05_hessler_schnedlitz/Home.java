package com.example.uebung05_hessler_schnedlitz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton zodiacHome = (ImageButton) findViewById(R.id.signsHomeButton);
        ImageButton housesHome = (ImageButton) findViewById(R.id.housesHomeButton);
        ImageButton planetsHome = (ImageButton) findViewById(R.id.planetsHomeButton);
        ImageButton uraniaHome = (ImageButton) findViewById(R.id.homeUrania);

        zodiacHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(getApplicationContext(), ZodiacSigns.class);

                startActivity(i);
            }
        });

        uraniaHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(), Home.class);
                startActivity(home);
            }
        });
    }
}