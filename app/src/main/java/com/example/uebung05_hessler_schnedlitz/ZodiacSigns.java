package com.example.uebung05_hessler_schnedlitz;
/*
Author: Elena Schnedlitz
Class: ZodiacSigns.java
Project: Uebung05_Heßler_Schnedlitz
Date: 16.12.2021
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ZodiacSigns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_signs);

        ImageButton homeUrania = (ImageButton) findViewById(R.id.uraniaButton);

        homeUrania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backHome = new Intent(getApplicationContext(), Home.class);
                startActivity(backHome);
            }
        });
    }
}