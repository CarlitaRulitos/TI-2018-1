package com.carlitarulitos;

import static java.lang.Math.abs;

public class ListaMisiles {
    private Misil[] misiles;
    private  int pLibreMisiles;

    public ListaMisiles(int n){
        misiles = new Misil[n];
    }

    public boolean agregarMisil(Misil n){
        if(pLibreMisiles > misiles.length){
            return false;
        }
        else{
            misiles[pLibreMisiles] = n;
            pLibreMisiles++;
            return true;
        }
    }

    public int sumarMisiles(double la, double lo){
        int cont = 0;
        for(int i = 0; i< misiles.length && misiles[i] != null; i++){
            if(abs(misiles[i].getLatitud()-la) < 0.00000001 && abs(misiles[i].getLongitud()-lo) < 0.00000001 ){
                cont++;
            }
        }
        return cont;
    }
}
