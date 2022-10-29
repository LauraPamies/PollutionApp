package com.example.pollutiontracker;

import org.json.JSONException;
import org.json.JSONObject;

public class Logica {

    public void login(String usuario,String contrasena)
    {
        JSONObject jsonObject = new JSONObject();
        try{
            jsonObject.put("usuario",usuario);
            jsonObject.put("contrasena",contrasena);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
