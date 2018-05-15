package com.carlitarulitos;

public class EjercitoCoreano {
    private String comandanteEnJefe;
    private int cantidadEfectivos;
    private ControlLanzamiento[] puntosLanzamiento;

    public EjercitoCoreano(String c, int e, int n){
        comandanteEnJefe = c;
        cantidadEfectivos = e;
        puntosLanzamiento = new ControlLanzamiento[n];
    }

    public boolean agregarMisil(Misil n, int la, double lo){
        for(int i = 0; i < puntosLanzamiento.length; i++){
            if (puntosLanzamiento[i] == null){
                puntosLanzamiento[i] = new ControlLanzamiento(comandanteEnJefe, la, lo, puntosLanzamiento.length);
            }
            if(la == puntosLanzamiento[i].getLatitud() && (lo-puntosLanzamiento[i].getLongitud())<0.0000001){
                if(puntosLanzamiento[i].agregarMisil(n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int misilesApuntandoObjetivo(double la, double lo){
        int cont = 0;
        for(int i = 0;  i < puntosLanzamiento.length && puntosLanzamiento[i] != null; i++){
            cont += puntosLanzamiento[i].sumarMisiles(la, lo);
        }
        return cont;
    }
}
