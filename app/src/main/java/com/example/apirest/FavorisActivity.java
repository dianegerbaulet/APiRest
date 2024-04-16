package com.example.apirest;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class FavorisActivity extends AppCompatActivity {
    private Button buttonRetour;
    private Button buttonAnnonce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoris);
        buttonRetour = (Button) findViewById(R.id.buttonRetour);
        buttonAnnonce = (Button) findViewById(R.id.buttonAnnonce);

        buttonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FavorisActivity.this, AcheterActivity.class);
                startActivity(intent);
            }
        });

        buttonAnnonce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FavorisActivity.this, CitroenAmi.class);
                startActivity(intent);
            }
        });
    }

}