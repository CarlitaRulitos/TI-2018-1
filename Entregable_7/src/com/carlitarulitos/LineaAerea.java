package com.carlitarulitos;

public class LineaAerea {
    private String nombre;
    private String direccion;
    private ListaAviones flota;
    private ListaPasajeros pasajeros;

    public LineaAerea(String nombre, String dir){
        this.nombre=nombre;
        direccion=dir;
        flota = new ListaAviones();
        pasajeros = new ListaPasajeros();
    }

    public boolean agregarPasajero(Pasajero nuevo, int numVuelo){
        Avion aux = flota.buscarAvion(numVuelo);
        if(aux != null && pasajeros.buscarPasajero(nuevo.getRut()) == false ){
            if(pasajeros.contarAsientosPasajeros(aux.getNumero()) < aux.getCantPasajeros()){
                if(nuevo.asignarVuelo(aux)){
                    pasajeros.annadirPasajeros(nuevo);
                    return true;
                }
            }
        }
        return false;
    }

    private int contarDisponibilidad(Avion avionDest[]){
        int cont = 0;
        for(int i = 0; i < avionDest.length; i++){
            cont += avionDest[i].getCantPasajeros() - pasajeros.contarAsientosPasajeros(avionDest[i].getNumero());
        }
        return cont;
    }

    public Avion[] avionComercialMasConsume(){
        return flota.avionComercialQueMasConsume();
    }

    public double promedioConsumoCarga(){
        return flota.promedioConsumoCarga();
    }

    public Avion eliminarAvion(int numero){
        Avion a_ser_borrado = flota.buscarAvion(numero);
        Avion[] para_reubicar = flota.getAvionesDestino(a_ser_borrado.getDestino(), numero);
        int disponibilidad = contarDisponibilidad(para_reubicar);
        if(disponibilidad >= pasajeros.contarAsientosPasajeros(numero)){
            pasajeros.reasignarPasajeros(para_reubicar, numero);

            flota.eliminarAvion(numero);
            return a_ser_borrado;
        }
        // flota.eliminarAvion(numero);
        return null;
    }

    public void ordenarPorEdad(){
        pasajeros.ordenarPorEdad();
    }
}
