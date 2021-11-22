package com.example.proyectoam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio2);
    }
    public void configurarPuertas(View view){
        Intent intent = new Intent(this, PuertasActivity.class);
        startActivity(intent);
    }
    public void configurarUsuario(View view){
        Intent intent = new Intent(this, EditarUsuariosActivity.class);
        startActivity(intent);
    }
    public void abrirPuertas(View view){
        Intent intent = new Intent(this, AbrirPuertasActivity.class);
        startActivity(intent);
    }
    public void cerrarSesion(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}