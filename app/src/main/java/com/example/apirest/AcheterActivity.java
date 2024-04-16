package com.example.apirest;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class AcheterActivity extends AppCompatActivity {
    private Button searchButton, buttonFavoris, buttonAcheter, buttonVendre, buttonNouvelleRecherche;
    private Spinner spinnerMarque,  spinnerModele, spinnerPrix, spinnerKilometrage, spinnerAnnee, spinnerAutonomie, spinnerPuissance;
    private Spinner spinnerCouleur;
    private Spinner spinnerNbrePlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acheter);
        searchButton = (Button) findViewById(R.id.buttonRechercher);
        buttonFavoris = (Button) findViewById(R.id.buttonFavoris);
        buttonNouvelleRecherche = (Button) findViewById(R.id.buttonNouvelleRecherche);

        buttonAcheter = (Button) findViewById(R.id.buttonAcheter);
        buttonVendre = (Button) findViewById(R.id.buttonVendre);

        buttonAcheter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcheterActivity.this, WelcomePage.class);
                startActivity(intent);
            }
        });

        buttonNouvelleRecherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcheterActivity.this, AcheterActivity.class);
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



        searchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String selectedValue1 = spinnerMarque.getSelectedItem().toString();
                String selectedValue2 = spinnerModele.getSelectedItem().toString();
                String selectedValue3 = spinnerPrix.getSelectedItem().toString();
                String selectedValue4 = spinnerKilometrage.getSelectedItem().toString();
                String selectedValue5 = spinnerAnnee.getSelectedItem().toString();
                String selectedValue6 = spinnerAutonomie.getSelectedItem().toString();
                String selectedValue7 = spinnerPuissance.getSelectedItem().toString();
                String selectedValue8 = spinnerCouleur.getSelectedItem().toString();
                String selectedValue9 = spinnerNbrePlaces.getSelectedItem().toString();

                if (selectedValue1.equals("BMW") && selectedValue2.equals("I3 phase 2") && selectedValue3.equals("Entre 15 001€ et 20 000€") && selectedValue4.equals("Entre 60 001kms et 80 000kms") && selectedValue5.equals("2018") && selectedValue6.equals("Entre 201kms et 300kms")){
                    Intent intent = new Intent(AcheterActivity.this, BMWI3.class);
                    startActivity(intent);
                } else {
                    // Si "BMW" n'est pas sélectionné dans le Spinner
                    Toast.makeText(getApplicationContext(), "BMW n'est pas sélectionné dans le Spinner.", Toast.LENGTH_SHORT).show();
                }

            }

        });

/* Ci dessous l'idée à explorer afin de récupérer les données de la Base de données

        searchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    ConnectionRest connectionRest = new ConnectionRest();
                    JSONObject product = new JSONObject();
                    product.get("Marque");
                    product.get("Modèle");
                    product.get("Année");
                    product.get("Prix");
                    product.get("Kilométrage");
                    product.get("Autonomie");
                    product.get("Puissance");
                    product.get("Couleur");
                    product.get("NbrePlaces");
                    connectionRest.setObj(product);
                    connectionRest.execute("POST");
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
                Intent intent = new Intent(AcheterActivity.this, WelcomePage.class);
                startActivity(intent);
            }
             */



    }
}





