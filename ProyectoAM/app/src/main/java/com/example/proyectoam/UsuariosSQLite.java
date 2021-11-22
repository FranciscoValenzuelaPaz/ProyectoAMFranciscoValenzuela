package com.example.proyectoam;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class UsuariosSQLite extends SQLiteOpenHelper {

    public UsuariosSQLite(Context context) {
        super(context, "BDUSUARIOS", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE USUARIOS (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOMBRE TEXT, CONTRASENA TEXT,CORREO TEXT, CARGO TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void crearUsuario(Usuario usuario){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO USUARIOS (NOMBRE,CONTRASENA,CORREO,CARGO) VALUES ('"+usuario.getNombre()+"', '"+usuario.getContrasena()+"', '"+usuario.getCorreo()+"', '"+usuario.getCargo()+"');");
        db.close();
    }
    public void editarUsuario(Usuario usuario,int id){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE USUARIOS SET NOMBRE='"+usuario.getNombre()+"',CONTRASENA='"+usuario.getContrasena()+"',CORREO='"+usuario.getCorreo()+"',CARGO='"+usuario.getCargo()+"' WHERE ID ="+id+";");
        db.close();
    }
    public void eliminarUsuario(int id){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM USUARIOS WHERE ID="+id+";");
    }

    public List<Usuario> leerUsuario(){
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM USUARIOS;",null);
        while(cursor.moveToNext()){
            Usuario usu = new Usuario();
            usu.setId(cursor.getInt(0));
            usu.setNombre(cursor.getString(1));
            usu.setContrasena(cursor.getString(2));
            usu.setCorreo(cursor.getString(3));
            usu.setCargo(cursor.getString(4));
            usuarios.add(usu);
            usu = null;
        }
        cursor.close();
        db.close();
        return usuarios;
    }
}
