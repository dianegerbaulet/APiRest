package com.example.apirest;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
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


        spinnerMarque = findViewById(R.id.Marque);
        spinnerModele = findViewById(R.id.Modèle);
        spinnerPrix = findViewById(R.id.Prix);
        spinnerKilometrage = findViewById(R.id.Kilométrage);
        spinnerAnnee = findViewById(R.id.Annee);
        spinnerAutonomie = findViewById(R.id.Autonomie);
        spinnerPuissance = findViewById(R.id.Puissance);
        spinnerCouleur = findViewById(R.id.Couleur);
        spinnerNbrePlaces = findViewById(R.id.Nombre_de_places);


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



                if (selectedValue1.equals("BMW") && selectedValue2.equals("I3 phase 2") && selectedValue3.equals("Entre 15 001€ et 20 000€") && selectedValue4.equals("Entre 60 001kms et 80 000kms") && selectedValue5.equals("2018") && selectedValue6.equals("Entre 201kms et 300kms")) {
                    Intent intent = new Intent(AcheterActivity.this, BMWI3.class);
                    startActivity(intent);
                } else if (selectedValue1.equals("Citroen") && selectedValue2.equals("Ami") && selectedValue3.equals("Entre 5 001€ et 10 000€") && selectedValue4.equals("Entre 0kms et 20 000kms") && selectedValue5.equals("2021") && selectedValue6.equals("Entre 0kms et 100kms")) {
                    Intent intent = new Intent(AcheterActivity.this, CitroenAmi.class);
                    startActivity(intent);
                } else if (selectedValue1.equals("") || selectedValue2.equals("") || selectedValue3.equals("") || selectedValue4.equals("") || selectedValue5.equals("") || selectedValue6.equals("") || selectedValue7.equals("") || selectedValue8.equals("") || selectedValue9.equals("") ){
                    Toast.makeText(getApplicationContext(), "Toutes les informations principales ne sont pas renseignées", Toast.LENGTH_SHORT).show();
                } else {
                    // Si "Tous les paramètres ne sont pas rentrés ou que la voiture n'est pas dans la base de données"
                    Toast.makeText(getApplicationContext(), "La voiture n'est pas dans la base de donnés", Toast.LENGTH_SHORT).show();
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





