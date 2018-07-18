package com.carlitarulitos;

public abstract class Avion {
    private int id;
    private String marca;
    private String modelo;
    private int annoFabricacion;
    private int capacidad;

    public Avion(int id, String marca, String modelo, int annoFabricacion, int capacidad){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.annoFabricacion = annoFabricacion;
        this.capacidad = capacidad;
    }

    public abstract double getConsumoEnergia();

    public int getId(){
        return id;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
}
