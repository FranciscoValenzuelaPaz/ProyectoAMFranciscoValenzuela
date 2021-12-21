package com.example.proyectoam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IniciarSesionActivity extends AppCompatActivity {
    UsuariosSQLite inicio;
    boolean respuesta;
    String usuario;
    String contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

    public void iniciarSesion(View view){
        //falta agregar codigo para captura de usuario y verificacion de datos.
        usuario = findViewById(R.id.usuario).toString();
        contrasena = findViewById(R.id.contrasena).toString();
        respuesta = inicio.iniciarSesion(usuario,contrasena);
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
    }



}