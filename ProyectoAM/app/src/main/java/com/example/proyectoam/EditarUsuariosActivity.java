package com.example.proyectoam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.ParseException;

public class EditarUsuariosActivity extends AppCompatActivity {
    EditText cajaid=null;
    EditText cajanombre=null;
    EditText cajacontrasena=null;
    EditText cajacorreo=null;
    Spinner cajacargo=null;
    int ide;
    UsuariosSQLite sqLite=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_usuarios);
        cajaid = findViewById(R.id.cajaid);
        cajanombre = findViewById(R.id.nombre);
        cajacontrasena = findViewById(R.id.contrasena);
        cajacorreo = findViewById(R.id.correo);
        cajacargo = findViewById(R.id.cargo);
        sqLite = new UsuariosSQLite(this);
        ide=0;
    }
    public void editarUsuario(View view) {
        Usuario u = new Usuario();
        ide=Integer.parseInt(cajaid.getText().toString());
        u.setId(ide);
        u.setNombre(cajanombre.getText().toString());
        u.setContrasena(cajacontrasena.getText().toString());
        u.setCorreo(cajacorreo.getText().toString());
        u.setCargo(cajacargo.getSelectedItem().toString());

        sqLite.editarUsuario(u,ide);
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
    }
    public void eliminarUsuario(View view) throws ParseException {
        Usuario u = new Usuario();
        ide=Integer.parseInt(cajaid.getText().toString());
        sqLite.eliminarUsuario(ide);
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
    }
}