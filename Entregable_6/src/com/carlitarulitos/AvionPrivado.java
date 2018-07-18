package com.carlitarulitos;

public class AvionPrivado extends Avion {
    private int camas;
    private double estanque_gasolina;
    private boolean jacussi;

    public AvionPrivado(int id, String marca, String modelo, int annoFabricacion, int capacidad, int camas, double estanque_gasolina, boolean jacussi){
        super(id, marca, modelo, annoFabricacion, capacidad);
        this.camas = camas;
        this.estanque_gasolina = estanque_gasolina;
        this.jacussi = jacussi;
    }

    // @Override
    public double getConsumoEnergia() {
        return estanque_gasolina/camas;
    }
}
