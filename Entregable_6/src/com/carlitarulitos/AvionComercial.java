package com.carlitarulitos;

public class AvionComercial extends Avion {
    private int tripulacion;
    private double kilometros_maximos;

    public AvionComercial(int id, String marca, String modelo, int annoFabricacion, int capacidad, int tripulacion, double kilometros_maximos){
        super(id, marca, modelo, annoFabricacion, capacidad);
        this.tripulacion = tripulacion;
        this.kilometros_maximos = kilometros_maximos;
    }

    // @Override
    public double getConsumoEnergia() {
        return tripulacion/(kilometros_maximos*kilometros_maximos);
    }
}
