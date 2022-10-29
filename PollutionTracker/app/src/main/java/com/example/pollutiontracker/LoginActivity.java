package com.example.pollutiontracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.edittextuser);
        pass = (EditText) findViewById(R.id.edittextpass);

    }

    public void botonentrar(View view) {
        String u = user.getText().toString();
        String p = pass.getText().toString();
        if (u.equals("") && p.equals("")) {
            Toast.makeText(this, "ERROR: Campos vacíos", Toast.LENGTH_LONG).show();
        } else if (u.equals("")) {
            Toast.makeText(this,"ERROR: Campo usuario vacío",Toast.LENGTH_LONG).show();
        } else if (p.equals(""))
        {
            Toast.makeText(this,"ERROR: Campo contraseña vacío",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"CAMPOS LLENOS",Toast.LENGTH_LONG).show();

        }
    }
}