
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
        this.marque = jObject.optString("Marque");
        this.modele = jObject.optString("Modele");
        this.annee = jObject.optString("Annee");
        this.prix = jObject.optString("Prix");
        this.kilometrage = jObject.optString("Kilometrage");
        this.autonomie = jObject.optString("Autonomie");
    }

    public int getId() { return id; }
    public String getMarque() { return marque; }
    public String getModele() { return modele; }
    public String getAnnee() { return annee; }
    public String getPrix() { return prix; }
    public String getKilometrage() { return kilometrage; }
    public String getAutonomie() { return autonomie; }
}

