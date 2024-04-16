package com.example.apirest;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class AcheterActivity extends AppCompatActivity {
    private Button searchButton;
    private Button buttonFavoris;
    private Button buttonAcheter;
    private Button buttonVendre;
    private Spinner spinnerMarque;
    private Spinner spinnerModele;
    private Spinner spinnerPrix;
    private Spinner spinnerKilometrage;
    private Spinner spinnerAnnee;
    private Spinner spinnerAutonomie;
    private Spinner spinnerPuissance;
    private Spinner spinnerCouleur;
    private Spinner spinnerNbrePlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acheter);
        searchButton = (Button) findViewById(R.id.buttonRechercher);
        buttonFavoris = (Button) findViewById(R.id.buttonFavoris);

        buttonAcheter = (Button) findViewById(R.id.buttonAcheter);
        buttonVendre = (Button) findViewById(R.id.buttonVendre);

        buttonAcheter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcheterActivity.this, WelcomePage.class);
                startActivity(intent);
            }
        });

        buttonVendre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcheterActivity.this, VendreActivity.class);
                startActivity(intent);
            }
        });

        buttonFavoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcheterActivity.this, FavorisActivity.class);
                startActivity(intent);
            }
        });


        Spinner spinnerMarque = findViewById(R.id.Marque);
        Spinner spinnerModele = findViewById(R.id.Modèle);
        Spinner spinnerPrix = findViewById(R.id.Prix);
        Spinner spinnerKilometrage = findViewById(R.id.Kilométrage);
        Spinner spinnerAnnee = findViewById(R.id.Annee);
        Spinner spinnerAutonomie = findViewById(R.id.Autonomie);
        Spinner spinnerPuissance = findViewById(R.id.Puissance);
        Spinner spinnerCouleur = findViewById(R.id.Couleur);
        Spinner spinnerNbrePlaces = findViewById(R.id.Nombre_de_places);


        String selectedValue1 = spinnerMarque.getSelectedItem().toString();
        String selectedValue2 = spinnerModele.getSelectedItem().toString();
        String selectedValue3 = spinnerPrix.getSelectedItem().toString();
        String selectedValue4 = spinnerKilometrage.getSelectedItem().toString();
        String selectedValue5 = spinnerAnnee.getSelectedItem().toString();
        String selectedValue6 = spinnerAutonomie.getSelectedItem().toString();
        String selectedValue7 = spinnerPuissance.getSelectedItem().toString();
        String selectedValue8 = spinnerCouleur.getSelectedItem().toString();
        String selectedValue9 = spinnerNbrePlaces.getSelectedItem().toString();


        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedValue1.equals("") || selectedValue2.equals("") || selectedValue3.equals("") || selectedValue4.equals("") || selectedValue5.equals("") || selectedValue6.equals("") || selectedValue7.equals("") || selectedValue8.equals("") || selectedValue9.equals("")) {
                    Toast.makeText(AcheterActivity.this, "Veuillez sélectionner une valeur dans chaque spinner", Toast.LENGTH_SHORT).show();
                } else if (selectedValue1.equals("BMW") || selectedValue2.equals("I3 phase 2") || selectedValue3.equals("Entre 15 001€ et 20 000€") || selectedValue4.equals("Entre 60 001kms et 80 000kms") || selectedValue5.equals("2018") || selectedValue6.equals("Entre 201kms et 300kms") || selectedValue7.equals("3 CV") || selectedValue8.equals("Bleu") || selectedValue9.equals("4")) {
                    Intent intent = new Intent(AcheterActivity.this, FavorisActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(AcheterActivity.this, "Ces caractéristiques ne correspondent à aucun véhicule de notre base de données", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}





