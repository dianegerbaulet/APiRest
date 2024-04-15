package com.example.apirest;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private Spinner spinnerMinYear, spinnerMaxYear, spinnerPriceMin, spinnerPriceMax;
    private Button buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        spinnerMinYear = findViewById(R.id.spinnerMinYear);
        spinnerMaxYear = findViewById(R.id.spinnerMaxYear);
        spinnerPriceMin = findViewById(R.id.spinnerPriceMin);
        spinnerPriceMax = findViewById(R.id.spinnerPriceMax);
        buttonSearch = findViewById(R.id.buttonSearch);

        // Set up spinner adapters with appropriate data (year ranges, price ranges)

        // Set up click listener for the "Favoris" button
        Button buttonFavoris = findViewById(R.id.buttonFavoris);
        buttonFavoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FavorisActivity.class);
                startActivity(intent);
            }
        });

        // Set up click listener for the "Search" button
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get selected filter values from spinners
                int minYear = getSelectedYear(spinnerMinYear);
                int maxYear = getSelectedYear(spinnerMaxYear);
                int minPrice = getSelectedPrice(spinnerPriceMin);
                int maxPrice = getSelectedPrice(spinnerPriceMax);

                // Create a new Intent to launch SearchResultsActivity
                Intent intent = new Intent(MainActivity.this, SearchResultsActivity.class);
                intent.putExtra("minYear", minYear);
                intent.putExtra("maxYear", maxYear);
                intent.putExtra("minPrice", minPrice);
                intent.putExtra("maxPrice", maxPrice);
                startActivity(intent);
            }
        });
    }

    // Helper methods to get selected values from spinners
    private int getSelectedYear(Spinner spinner) {
        // Implement logic to get the selected year from the spinner
    }

    private int getSelectedPrice(Spinner spinner) {
        // Implement logic to get the selected price from the spinner
    }

    Spinner spinner3 = findViewById(R.id.my_spinner);

    String[] data = getResources().getStringArray(R.array.spinner_data);

    ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
            android.R.layout.simple_spinner_item, data);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);

}
