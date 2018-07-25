package com.carlitarulitos;

public class LineaAerea {
    private String nombre;
    private String direccion;
    private ListaAviones flota;
    private ListaPasajeros pasajeros;

    public LineaAerea(String nombre, String dir){
        this.nombre=nombre;
        direccion=dir;
        flota = new ListaAviones();
        pasajeros = new ListaPasajeros();
    }
}
