package com.carlitarulitos;

public class Pasajero {
    private String nombre;
    private String rut;
    private Avion viajes[];

    public Pasajero(String nombre, String rut, int n){
        this.nombre = nombre;
        this.rut = rut;
        viajes = new Avion[n];
    }

    private int buscarEspacioLibre(){
        int i;
        for(i = 0; i < viajes.length; i++){
            if(viajes[i] == null){
                return i;
            }
        }
        return i;
    }

    public boolean agregarViaje(Avion viaje){
        int espacio = this.buscarEspacioLibre();
        if(espacio == viajes.length){
            return false;
        }
        viajes[espacio] = viaje;
        return true;
    }

    public int contarVuelos(){
        int contador = 0;
        for(int i = 0; i < viajes.length; i++){
            if(viajes[i] != null){
                contador += 1;
            }
        }
        return contador;
    }
}
