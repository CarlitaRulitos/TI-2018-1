package com.carlitarulitos;

public class NodoAvion {
    private Avion avion;
    private NodoAvion sig;

    public NodoAvion(Avion avion, NodoAvion sig){
        this.avion = avion;
        this.sig = sig;
    }

    public NodoAvion getSig() {
        return sig;
    }

    public Avion getAvion(){
        return avion;
    }
}
