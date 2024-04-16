package com.example.apirest;

import android.os.Bundle;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class CitroenAmi extends AppCompatActivity {
    private CheckBox Favoris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acheter_citroen_ami);

        Favoris = findViewById(R.id.Favoris);
    }
}
