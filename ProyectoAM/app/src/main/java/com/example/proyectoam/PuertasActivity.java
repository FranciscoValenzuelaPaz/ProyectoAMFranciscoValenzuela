package com.example.proyectoam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.ParseException;

public class PuertasActivity extends AppCompatActivity {
    EditText cajaid=null;
    EditText cajazona=null;
    int ide;

    PuertasSQLite sqLite=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puertas);
        cajaid = findViewById(R.id.cajaid);
        cajazona = findViewById(R.id.cajazona);
        ide = 0;
        sqLite = new PuertasSQLite(this);
    }
    public void registrarPuerta(View view){
        Puerta p = new Puerta();
        ide = Integer.parseInt(cajaid.getText().toString());
        p.setId(ide);
        p.setZona(cajazona.getText().toString());
        sqLite.crearPuerta(p);
    }
    public void editarPuerta(View view) {
        Puerta p = new Puerta();
        ide=Integer.parseInt(cajaid.getText().toString());
        p.setId(ide);
        p.setZona(cajazona.getText().toString());
        sqLite.editarPuerta(p,ide);
    }
    public void eliminarPuerta(View view) throws ParseException {
        Puerta p = new Puerta();
        ide=Integer.parseInt(cajaid.getText().toString());
        sqLite.eliminarPuerta(ide);
    }
    public void volverInicio(View view){
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
    }
}