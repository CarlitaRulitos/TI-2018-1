package com.carlitarulitos;

public abstract class Avion {
    private int numero;
    private String marca;
    private String modelo;
    private String destino;
    private int cantPasajeros;

    public Avion(int numero, String marca, String modelo, String destino, int cantPasajeros){
        this.numero=numero;
        this.marca=marca;
        this.modelo=modelo;
        this.cantPasajeros=cantPasajeros;
    }

    public abstract double consumoCombustible();

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public int getNumero() {
        return numero;
    }
}
