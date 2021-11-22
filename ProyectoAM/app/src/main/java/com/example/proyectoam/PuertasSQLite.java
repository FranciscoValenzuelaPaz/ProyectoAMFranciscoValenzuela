package com.example.proyectoam;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PuertasSQLite extends SQLiteOpenHelper {


    public PuertasSQLite(Context context) {
        super(context, "DBPUERTAS", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE PUERTAS (ID INTEGER PRIMARY KEY AUTOINCREMENT, ZONA TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void crearPuerta(Puerta puerta){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO PUERTAS (ZONA) VALUES ('"+puerta.getZona()+"');");
        db.close();
    }
    public void editarPuerta(Puerta puerta,int id){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE PUERTAS SET ZONA='"+puerta.getZona()+"' WHERE ID ="+id+";");
        db.close();
    }
    public void eliminarPuerta(int id){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM PUERTAS WHERE ID="+id+";");
    }

    public List<Puerta> leerPuertas(){
        ArrayList<Puerta> puertas = new ArrayList<Puerta>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM PUERTAS;",null);
        while(cursor.moveToNext()){
            Puerta p = new Puerta();
            p.setId(cursor.getInt(0));
            p.setZona(cursor.getString(1));
            puertas.add(p);
            p = null;
        }
        cursor.close();
        db.close();
        return puertas;
    }
}
