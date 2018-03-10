package com.example.bisite.agricoapp.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a on 09/03/2018.
 */

public class Conexion extends SQLiteOpenHelper {

    final String CREAR_TABLA_EMPRESAS="CREATE TABLE empresas(id INTEGER PRIMARY KEY, nombre TEXT, contra TEXT)";
    final String CREAR_TABLA_USUARIOS="CREATE TABLE usuarios(id INTEGER PRIMARY KEY autoincrement, nombre TEXT, correo TEXT, telefono INTEGER, suelo TEXT, cantagua FLOAT, hectareas INTEGER, maquinaria TEXT, numtractores INTEGER, tiposemilla TEXT, ultimafertilizante DATE, ultimainsecticida DATE, cantidadfertilizante FLOAT, cantidadinsecticida FLOAT, aproximacionproduccion INTEGER, fechasiembra DATE, fecharecogida DATE, ultimoriego DATE, semanapreparacion INETEGER)";

    public Conexion(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_EMPRESAS);
        db.execSQL(CREAR_TABLA_USUARIOS);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Cursor consulta(String con)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cur=db.rawQuery(con, null);
        return cur;
    }

    public void insertar(String ins)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        db.execSQL(ins);
    }
}