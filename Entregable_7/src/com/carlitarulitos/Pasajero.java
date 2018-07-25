package com.carlitarulitos;

public class Pasajero {
    private String rut;
    private String nombre;
    private int edad;
    private String direccion;
    private Avion viajes[];
    private int pLibre;

    public Pasajero(String rut, String nombre, int edad, String direccion, int cantViajes){
        this.rut=rut;
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
        viajes=new Avion[cantViajes];
        pLibre=0;
    }
    public Pasajero(String rut, String nombre, int edad, int cantViajes){
        this(rut, nombre, edad, null, cantViajes);
    }

    public String getRut() {
        return rut;
    }

    public int contarAsientos(int numero){
        int cont=0;
        for (int i=0; i<pLibre; i++){
            if (viajes[i].getNumero()==numero){
                cont++;
            }
        }
        return cont;
    }

    public boolean asignarVuelo(Avion avion){
        if (pLibre<viajes.length){
            viajes[pLibre]=avion;
            pLibre++;
            return true;
        }
        return false;
    }
}
