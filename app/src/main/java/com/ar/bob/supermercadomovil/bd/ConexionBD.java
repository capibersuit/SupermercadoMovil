package com.ar.bob.supermercadomovil.bd;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bob on 29/10/15.
 */
public class ConexionBD {

    private SQLiteDatabase db;
    private Context nContext;
    private BD objBD;

    //Constructor de la Clase
    //Recibe como parámetro una variable de Tipo contexto
    // Esto debido a que Para acceder o crear la BD lo pide la Clase SQLiteOpenHelper
    public ConexionBD(Context c){
        nContext=c;

    }

    public void abrirConexion(){
        objBD =new BD(nContext,"BDsuper",null,1 );
        db=objBD.getWritableDatabase();
    }

    public void cerrarConexion(){
        db.close();
    }

    public boolean insertar(String descripcion, String precio) {
   // public boolean insertar(String tabla, HashMap<String,String> campos_y_valores){
        boolean resultado=false;

        try{
/*
            StringBuffer campos1 = new StringBuffer();
            StringBuffer valores = new StringBuffer();

            Set<String> claves= campos_y_valores.keySet();

            for (int i = 0; i <claves.size() ; i++) {
                campos1.append(claves.         }
  */
            String query="INSERT INTO productos(descripcion, precio, Telefono, Email) VALUES('"+descripcion+"','"+precio+"')";

            db.execSQL(query);
            resultado=true;
            return resultado;
        }
        catch (Exception e){
            resultado=false;
            return resultado;
        }
    }

    public Cursor buscarTodos() {
        Cursor c = db.rawQuery(" SELECT descripcion, precio FROM productos", null);

        return c;
    }
}
