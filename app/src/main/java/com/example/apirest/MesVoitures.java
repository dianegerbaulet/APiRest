
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

    public MesVoitures(JSONObject jObject) {
        this.id =jObject.optInt("id");
        this.marque = jObject.optString("marque");
        this.modele = jObject.optString("modele");
        this.annee = jObject.optString("annee");
        this.prix = jObject.optString("prix");
        this.kilometrage = jObject.optString("kilometrage");
        this.autonomie = jObject.optString("autonomie");
    }

    public int getId() { return id; }
    public String getMarque() { return marque; }
    public String getModele() { return modele; }
    public String getAnnee() { return annee; }
    public String getPrix() { return prix; }
    public String getKilometrage() { return kilometrage; }
    public String getAutonomie() { return autonomie; }
}

