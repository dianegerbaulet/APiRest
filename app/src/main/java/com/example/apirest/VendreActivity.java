
package com.example.apirest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class VendreActivity extends AppCompatActivity {

    private EditText Marque, Modele,  Annee,  Prix,  Kilometrage,  Autonomie, Puissance, Couleur, NbrePlaces;
    private Button buttonPublier;
    private Button buttonAjouterPhotos;
    private Button buttonAcheter;
    private Button buttonVendre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendre);

        Marque = findViewById(R.id.editMarque);
        Modele = findViewById(R.id.editModele);
        Annee = findViewById(R.id.editAnnée);
        Prix = findViewById(R.id.editPrix);
        Kilometrage = findViewById(R.id.editkms);
        Autonomie = findViewById(R.id.editAutonomie);
        Puissance = findViewById(R.id.editPuissance);
        Couleur = findViewById(R.id.editCouleur);
        NbrePlaces = findViewById(R.id.editNbrePlaces);

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

        buttonPublier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    try {
                        ConnectionRest connectionRest = new ConnectionRest();
                        JSONObject product = new JSONObject();
                        product.put("Marque", Marque.getText().toString());
                        product.put("Modèle", Modele.getText().toString());
                        product.put("Année", Annee.getText().toString());
                        product.put("Prix", Prix.getText().toString());
                        product.put("Kilométrage", Kilometrage.getText().toString());
                        product.put("Autonomie", Autonomie.getText().toString());
                        product.put("Puissance", Puissance.getText().toString());
                        product.put("Couleur", Couleur.getText().toString());
                        product.put("NbrePlaces", NbrePlaces.getText().toString());
                        connectionRest.setObj(product);

                        connectionRest.execute("POST");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    Intent intent = new Intent(VendreActivity.this, WelcomePage.class);
                    startActivity(intent);
                } finally {

                }
            }
        });


    }
}