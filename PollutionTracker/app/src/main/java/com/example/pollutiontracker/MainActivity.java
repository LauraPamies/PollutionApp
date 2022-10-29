package com.example.pollutiontracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botonlogin(View view){
        Log.d("--","BOTÓN LOGIN PULSADO");
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }
}