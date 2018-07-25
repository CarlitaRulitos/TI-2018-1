package com.carlitarulitos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        LineaAerea empresa = new LineaAerea("Nombre", "Direccion");

        String nombre, rut, direccion;
        int edad, nVuelos, numero_vuelo, num_avion;
        Pasajero pasa;
        Avion[] avions;
        Avion eliminado;
        double promedio;


        boolean prog = true;
        while(prog){
            System.out.println("Ingrese su eleccion: ");
            switch(lector.readLine()){
                case "Agregar pasajero":
                    System.out.println("Ingrese rut: ");
                    rut = lector.readLine();
                    System.out.println("Ingrese nombre: ");
                    nombre = lector.readLine();
                    System.out.println("Ingrese edad: ");
                    edad = Integer.parseInt(lector.readLine());

                    System.out.println("Ingrese cantidad de vuelos: ");
                    nVuelos = Integer.parseInt(lector.readLine());


                    System.out.println("Ingrese el numero de vuelo: ");
                    numero_vuelo = Integer.parseInt(lector.readLine());

                    System.out.println("Ingresara direccion?: ");
                    if(lector.readLine().equals("si")) {
                        System.out.println("Ingrese direccion: ");
                        direccion = lector.readLine();
                        pasa = new Pasajero(rut, nombre, edad, direccion, nVuelos);
                    }
                    else{
                        pasa = new Pasajero(rut, nombre, edad, nVuelos);
                    }

                    if(empresa.agregarPasajero(pasa, numero_vuelo)){
                        System.out.println("Pasajero agregado con exito!");
                    }
                    else{
                        System.out.println("Ocurrio un problema :( ");
                    }
                    break;

                case "Eliminar avion por falla":

                    System.out.println("Ingrese numero del avion: ");
                    num_avion = Integer.parseInt(lector.readLine());


                    eliminado = empresa.eliminarAvion(num_avion);
                    if(eliminado != null){
                        System.out.println("Avion eliminado, numero: " + eliminado.getNumero() + " destino: " + eliminado.getDestino());
                    }
                    else{
                        System.out.println("Ocurrio un problema :( ");
                    }
                    break;

                case "Avion comercial que mas consume":
                    System.out.println("Los aviones comerciales que mas consumen son: ");
                    avions = empresa.avionComercialMasConsume();
                    for(int i = 0; i < avions.length; i++){
                        System.out.println(avions[i].getNumero());
                    }
                    System.out.println("Con un consumo de: " + avions[0].consumoCombustible());
                    break;
                case "Promedio consumo carga":
                    System.out.println("Los aviones comerciales que mas consumen son: ");
                    promedio = empresa.promedioConsumoCarga();
                    System.out.println("El promedio de consume en aviones de carga es: " + promedio);
                    break;
                case "Ordenar pasajeros":
                    empresa.ordenarPorEdad();
                    break;


                case "salir":
                    prog = false;
                    break;
            }
        }
    }
}
