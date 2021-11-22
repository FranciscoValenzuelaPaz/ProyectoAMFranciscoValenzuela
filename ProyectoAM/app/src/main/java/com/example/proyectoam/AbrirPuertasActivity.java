package com.example.proyectoam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AbrirPuertasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abrir_puertas);
    }
    public void volverInicio2(View view){
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
    }
}