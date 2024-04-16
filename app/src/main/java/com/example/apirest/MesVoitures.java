
package com.example.apirest;

import org.json.JSONObject;

public class MesVoitures {
    private final int id;
    private final String marque;
    private final String modele;
    private final String annee;
    private final String prix;
    private final String kilometrage;
    private final String autonomie;
    private final String puissance;
    private final String couleur;
    private final String nbreplaces;

    public MesVoitures(JSONObject jObject) {
        this.id =jObject.optInt("id");
        this.marque = jObject.optString("Marque");
        this.modele = jObject.optString("Modèle");
        this.annee = jObject.optString("Année");
        this.prix = jObject.optString("Prix");
        this.kilometrage = jObject.optString("Kilométrage");
        this.autonomie = jObject.optString("Autonomie");
        this.puissance = jObject.optString("Puissance");
        this.couleur = jObject.optString("Couleur");
        this.nbreplaces = jObject.optString("NbrePlaces");
    }

    public int getId() { return id; }
    public String getMarque() { return marque; }
    public String getModele() { return modele; }
    public String getAnnee() { return annee; }
    public String getPrix() { return prix; }
    public String getKilometrage() { return kilometrage; }
    public String getAutonomie() { return autonomie; }
    public String getPuissance() { return puissance; }
    public String getCouleur() { return couleur; }
    public String getNbreplaces() { return nbreplaces; }
}

