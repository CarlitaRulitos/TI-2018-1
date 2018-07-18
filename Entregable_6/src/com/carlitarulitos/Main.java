package com.carlitarulitos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        ListaAviones aviones = new ListaAviones(10);

        boolean prog = true;
        while (prog){
            switch (lector.readLine()){
                case "comercialesConsumistas":
                    System.out.println("La marca comercial que mas consume es: " + aviones.marcaComercialMasConsumista());
                    break;
                case "privadosBaratos":
                    System.out.println("La marca comercial que mas consume es: " + aviones.marcaPrivadaMenosConsumista());
                    break;
                case "eliminar":
                    System.out.println("Ingrese modelo: ");
                    aviones.eliminarPorModeloEImprimir(lector.readLine());
                    break;
                case "salir":
                    prog = false;
                    break;
            }
        }
    }
}
