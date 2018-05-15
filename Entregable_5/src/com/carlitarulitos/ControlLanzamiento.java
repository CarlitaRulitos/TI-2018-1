package com.carlitarulitos;

public class ControlLanzamiento {
    private String generalACargo;
    private int latitud;
    private double longitud;
    private ListaMisiles misiles;

    public ControlLanzamiento(String g, int la ,double lo, int n){
        generalACargo = g;
        latitud = la;
        longitud = lo;
        misiles = new ListaMisiles(n);
    }

    public int getLatitud(){
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public boolean agregarMisil(Misil n){
        return misiles.agregarMisil(n);
    }

    public int sumarMisiles(double la, double lo){
        return misiles.sumarMisiles(la, lo);
    }
}
