
package com.example.apirest;

import android.os.AsyncTask;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class ConnectionRest extends AsyncTask<String, Void, String> {
    private final static String URL = "https://api.munier.me/admin/db-data.php";
    private JSONObject jsonObj = null;
    private String action = "voitures";

    public ArrayList<MesVoitures> parse(final String json) {
        try {
            final ArrayList<MesVoitures> products = new ArrayList<>();
            final JSONArray jProductArray = new JSONArray(json);
            for (int i = 0; i < jProductArray.length(); i++) {
                MesVoitures voitures = new MesVoitures(jProductArray.optJSONObject(i));
                products.add(new MesVoitures(jProductArray.optJSONObject(i)));
            }
            return products;

        } catch (JSONException e) {
            Log.v("TAG","[JSONException] e : " + e.getMessage());
        }
        return null;
    }

    public void setObj(JSONObject jsonObj){
        this.jsonObj = jsonObj;
    }
    public void setAction(String monAction){ this.action = monAction;}

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }
    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
