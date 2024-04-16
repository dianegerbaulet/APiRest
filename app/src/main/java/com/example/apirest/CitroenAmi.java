package com.example.apirest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class CitroenAmi extends AppCompatActivity {
    private CheckBox Favoris;
    private Button buttonRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acheter_citroen_ami);

        Favoris = findViewById(R.id.Favoris);
        buttonRetour = findViewById(R.id.button);
        buttonRetour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CitroenAmi.this, AcheterActivity.class);
                startActivity(intent);
            }
        });
    }
}
