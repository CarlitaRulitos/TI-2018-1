package com.carlitarulitos;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Persona Persona1 = new Persona("19222444-6", "carlita");
        Persona Persona2 = new Persona("19125145-8", "Angie");
        Persona Persona3 = new Persona("8111818-3", "jorge");

        System.out.println(Persona1.getNombre()+ ", " + Persona2.getNombre());
        System.out.println(Persona3.getRut());

        Persona3.setNombre(Persona2.getNombre());


    }
}
