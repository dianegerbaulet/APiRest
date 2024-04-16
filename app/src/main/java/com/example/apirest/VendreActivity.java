package com.example.apirest;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VendreActivity extends AppCompatActivity {
    private Button buttonAjouterPhotos;
    private Button buttonPublier;

    private Button buttonAcheter;
    private Button buttonVendre;
    private EditText Marque, Modele, Annee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendre);
        buttonAjouterPhotos = (Button) findViewById(R.id.buttonRetour);
        buttonPublier = (Button) findViewById(R.id.buttonPublier);
        buttonAcheter = (Button) findViewById(R.id.buttonAcheter);
        buttonVendre = (Button) findViewById(R.id.buttonVendre);

        buttonAcheter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VendreActivity.this, AcheterActivity.class);
                startActivity(intent);
            }
        });

        buttonVendre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VendreActivity.this, WelcomePage.class);
                startActivity(intent);
            }
        });
    }
}