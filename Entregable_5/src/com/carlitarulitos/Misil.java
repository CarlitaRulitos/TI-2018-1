package com.carlitarulitos;

public class Misil {
    private int numeroId;
    private double potencia;
    private double latitud;
    private double longitud;

    public Misil(int n , double p, double la, double lo){
        potencia = p;
        numeroId = n;
        latitud = la;
        longitud = lo;
    }

    public Misil(int n, double la, double lo){
        this(n, 0, la, lo);
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }
}

