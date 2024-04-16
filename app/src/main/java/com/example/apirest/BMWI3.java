package com.example.apirest;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class BMWI3 extends AppCompatActivity {
    private CheckBox Favoris;
    private Button buttonRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acheter_bmw_i3);

        Favoris = findViewById(R.id.Favoris);
        buttonRetour = findViewById(R.id.button2);
        buttonRetour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(BMWI3.this, AcheterActivity.class);
                startActivity(intent);
            }
        });
    }
}

