package com.carlitarulitos;

public class AvionComercial extends Avion {
    private double tamEstanque;

    public AvionComercial (int numero, String marca, String modelo, String destino, int cantPasajeros, double tamEstanque){
        super(numero,marca,modelo, destino, cantPasajeros);
        this.tamEstanque=tamEstanque;
    }

    public double consumoCombustible(){
        return (tamEstanque*0.75)/getCantPasajeros();
    }
}
