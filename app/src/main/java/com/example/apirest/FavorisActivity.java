package com.example.apirest;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class FavorisActivity extends AppCompatActivity {
    private Button buttonRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoris);
        buttonRetour = (Button) findViewById(R.id.buttonRetour);

        buttonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FavorisActivity.this, AcheterActivity.class);
                startActivity(intent);
            }
        });
    }

}