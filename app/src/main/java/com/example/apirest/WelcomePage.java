package com.example.apirest;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity {
    private Button buttonAcheter;
    private Button buttonVendre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        buttonAcheter = (Button)findViewById(R.id.button_Acheter);
        buttonVendre = (Button)findViewById(R.id.button_Vendre);

        buttonAcheter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomePage.this, AcheterActivity.class);
                startActivity(intent);
            }
        });
        buttonVendre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomePage.this, VendreActivity.class);
                startActivity(intent);
            }
        });
    }
}