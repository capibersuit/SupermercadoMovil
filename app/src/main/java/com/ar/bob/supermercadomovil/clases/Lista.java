package com.ar.bob.supermercadomovil.clases;

import java.util.ArrayList;

/**
 * Created by chris on 03/11/15.
 */
public class Lista {

    private int id;
    private String nombre;
    private ArrayList<Producto> productos;

    public Lista(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
