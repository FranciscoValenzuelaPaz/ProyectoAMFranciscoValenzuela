package com.example.proyectoam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class RegistroActivity extends AppCompatActivity {

        EditText cajanombre=null;
        EditText cajacontrasena=null;
        EditText cajacorreo=null;
        Spinner cajacargo=null;

        UsuariosSQLite sqLite=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        cajanombre = findViewById(R.id.nombre);
        cajacontrasena = findViewById(R.id.contrasena);
        cajacorreo = findViewById(R.id.correo);
        cajacargo = findViewById(R.id.cargo);
        sqLite = new UsuariosSQLite(this);
    }

    public void registrar(View view){
        Usuario usu = new Usuario();
        usu.setNombre(cajanombre.getText().toString());
        usu.setContrasena(cajacontrasena.getText().toString());
        usu.setCorreo(cajacorreo.getText().toString());
        usu.setCargo(cajacargo.getSelectedItem().toString());
        sqLite.crearUsuario(usu);

    }
}