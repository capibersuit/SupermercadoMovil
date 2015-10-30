package com.ar.bob.supermercadomovil.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bob on 29/10/15.
 */
public class BD extends SQLiteOpenHelper {

    //Query para crear las tablas en la bd
    String query="CREATE TABLE productos (id INTEGER PRIMARY KEY AUTOINCREMENT, descripcion TEXT, precio float)";

    //Constructor de la clase
    public BD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Ejecuta query para crear la tabla
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i2) {
        db.execSQL("DROP TABLE IF EXISTS productos");

        //Se crea la nueva versión de la tabla
        db.execSQL(query);
    }
}
