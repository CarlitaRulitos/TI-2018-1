package com.carlitarulitos;

public class AvionCarga extends Avion {
    private double kilos;

    public AvionCarga(int num, String marca, String modelo, String destino, int cantPasajeros, double kilos){
        super(num, marca, modelo, destino, cantPasajeros);
        this.kilos=kilos;
    }

    public double consumoCombustible(){
        return((getCantPasajeros()/70)+kilos/100);
    }
}
