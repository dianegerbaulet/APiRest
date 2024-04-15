package com.example.apirest;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class ApiManager extends AsyncTask<String, Void, String> {
    private final static String URL = "https://api.munier.me/diane/";
    private JSONObject jsonObj = null;

    private String action = "product";

    @Override
    protected String doInBackground(String... strings) {
        try {
            return get(strings[0]);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String get(String methode) throws IOException, JSONException {
        String url = URL+action+"/";
        InputStream is = null;
        String parameters = "";
        Log.v("methode", methode);
        if(!methode.equals("POST")&&(jsonObj!=null)){
            url += jsonObj.getInt("id");
        }
        if(jsonObj != null){
            if(methode.equals("PUT")){
                jsonObj.remove("id");

            }
            parameters  = "data="+URLEncoder.encode(jsonObj.toString(), "utf-8");
            Log.v("URL", url+" "+parameters);
        }
        try {
            final HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod(methode);

            // Pour les methode POST et PUT on envoie les parametre avec l'OutputStreamWriter
            if(methode.equals("POST")||methode.equals("PUT")){
                conn.setDoInput(true);
                conn.setDoOutput(true);
                OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
                out.write(parameters);// here i sent the parameter
                out.close();
            }else{
                conn.setDoInput(true);
                conn.connect();
            }

            is = conn.getInputStream();
            // Lit le InputStream et l'enregistre dans une string
            return readIt(is);
        } finally {
            // Pour etre sur que le InputStream soit ferme apres avoir quitter l'application
            if (is != null) {
                is.close();
            }
        }
    }

    private String readIt(InputStream is) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = r.readLine()) != null) {
            response.append(line).append('\n');
        }
        return response.toString();
    }

    public void setObj(JSONObject jsonObj){
        this.jsonObj = jsonObj;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
