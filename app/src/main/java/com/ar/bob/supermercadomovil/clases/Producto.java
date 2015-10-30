package com.ar.bob.supermercadomovil.clases;

import com.ar.bob.supermercadomovil.bd.ConexionBD;

import java.util.HashMap;

/**
 * Created by bob on 29/10/15.
 */
public class Producto {
    private int id;
    private String descripcion;
    private float precio;

    public int getId() {
        return id;
    }

    public Producto(float precio, String descripcion, int id) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.id = id;
    }

    public Producto(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Producto() {

    }

    public String getDescripcion() {
        return descripcion;

    }

    public Producto(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void grabar() {
        HashMap <String,String> campos_valores = new HashMap<String, String>();

        campos_valores.put("descripcion", this.descripcion);
        campos_valores.put("precio", String.valueOf(this.precio));

       // ConexionBD ObjCnx = new ConexionBD();

        //ObjCnx.abrirConexion();
    }
}
