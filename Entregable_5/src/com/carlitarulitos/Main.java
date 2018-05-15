package com.carlitarulitos;

public class Main {
    public static void main(String[] args){
        EjercitoCoreano coreano = new EjercitoCoreano("Malvado", 15, 10);
        Misil misil = new Misil(0, 15, 2, 3);
        System.out.println("Se agrego: " + coreano.agregarMisil(misil, 2, 3));


        System.out.println("Misiles apuntando: " + coreano.misilesApuntandoObjetivo(2, 3));
        System.out.println("Misiles apuntando: " + coreano.misilesApuntandoObjetivo(2, 4));

    }

}
