package com.example.proyectoam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Francisco Valenzuela
        setContentView(R.layout.activity_main);
    }


    public void cambiarInicioSesion(View view) {
        Intent intent = new Intent(this, IniciarSesionActivity.class);
        startActivity(intent);

    }

    public void cambiarRegistrar(View view) {
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

}