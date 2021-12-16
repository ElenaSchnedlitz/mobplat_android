package com.example.uebung05_hessler_schnedlitz;
/*
Author: Elena Schnedlitz
Class: MainActictivity.java
Project: Uebung05_Heßler_Schnedlitz
Date: 16.12.2021
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logButton = (Button) findViewById(R.id.logButton);

        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register(view);
            }
        });
    }
    public void register(View v){

        EditText name = findViewById(R.id.et_name);
        EditText email = findViewById(R.id.et_email);

        if((name.getText().length() == 0) ||(email.getText().length() == 0)) {
            printText("Please fill all fields!");
            return;
        }
        toHomePage();
    }
    private void printText(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
//
    private void toHomePage(){
        Intent intent = new Intent(getApplicationContext(), Home.class);
        startActivity(intent);
    }
}