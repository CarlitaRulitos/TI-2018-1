package com.carlitarulitos;

import java.io.*;

public class Cafeta {
    public static void main(String[] arg) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        boolean con = true;
        String r="", n="", wn="";
        int e = 0, f = 0, t = 0, i = 0, d = 0, c = 0, b = 0, a = 0, sano = 0;
        int se = 0, sf = 0, st = 0, si = 0, sd = 0, sc = 0, sb = 0, sa = 0;

        System.out.println("¿Desea ingresar cliente? Responda SI para ingresar, NO para finalizar");
        r = leer.readLine();
        if (r.equals("SI")) {


            while (con) { //nuevo cliente


                int x = 0, sanoe = 0, sanoa = 0, sanof = 0;
                System.out.println("Ingrese nombres y rut separados por espacios");
                n = leer.readLine();

                while (x != 9) {
                    System.out.println("Ingrese producto");
                    System.out.println("1 para ensalada ave");
                    System.out.println("2 para pote de frutas");
                    System.out.println("3 para completo");
                    System.out.println("4 para churrasco");
                    System.out.println("5 para dulce");
                    System.out.println("6 para cafe");
                    System.out.println("7 para bebida");
                    System.out.println("8 para agua");
                    System.out.println("9 para salir");

                    x = Integer.parseInt(leer.readLine());


                    switch (x) {

                        case 1:
                            System.out.println("Ingrese cantidad");
                            e = Integer.parseInt(leer.readLine());
                            sanoe = e + sanoe;
                            se = e + se;
                            break;

                        case 2:
                            System.out.println("Ingrese cantidad");
                            f = Integer.parseInt(leer.readLine());
                            sanof = f + sanof;
                            sf = f + sf;
                            break;

                        case 3:
                            System.out.println("Ingrese cantidad");
                            t = Integer.parseInt(leer.readLine());
                            st = t + st;
                            break;

                        case 4:
                            System.out.println("Ingrese cantidad");
                            i = Integer.parseInt(leer.readLine());
                            si = i + si;
                            break;

                        case 5:
                            System.out.println("Ingrese cantidad");
                            d = Integer.parseInt(leer.readLine());
                            sd = d + sd;
                            break;

                        case 6:
                            System.out.println("Ingrese cantidad");
                            c = Integer.parseInt(leer.readLine());
                            sc = c + sc;
                            break;

                        case 7:
                            System.out.println("Ingrese cantidad");
                            b = Integer.parseInt(leer.readLine());
                            sb = b + sb;
                            break;

                        case 8:
                            System.out.println("Ingrese cantidad");
                            a = Integer.parseInt(leer.readLine());
                            sanoa = a + sanoa;
                            sa = a + sa;
                            break;

                        case 9:
                            System.out.println("Ya no se podrá ingresar más productos para este cliente");
                            break;

                        default:
                            System.out.println("El producto ingresado nno existe");
                            break;


                    }

                    if (x == 9) {
                        int pepe = 0;
                        pepe = sanoa + sanof + sanoe;
                        if (pepe > sano) {
                            sano = pepe;
                            wn = n;
                        }
                    }
                }

                System.out.println("¿Desea ingresar cliente? Responda SI para ingresar, NO para finalizar");
                r = leer.readLine();
                if (r.equals("SI")) {
                    con = true;
                } else {
                    con = false;
                }
            }
        } else {
            System.out.println("No ingresó datos, así que no hay producto mejor vendido, o cliente más sano.");
        }

        System.out.println("El usuario mas sano es: " + wn);

        if (se >= sf && se >= st && se >= si && se >= sd && se >= sc && se >= sb && se >= sa) {
            System.out.println("El producto mas vendido es ensalada de ave");
        } else {
            if (sf >= se && sf >= st && sf >= si && sf >= sd && sf >= sc && sf >= sb && sf >= sa) {
                System.out.println("El producto mas vendido es pote de frutas");
            } else {
                if (st >= sf && st >= se && st >= si && st >= sd && st >= sc && st >= sb && st >= sa) {
                    System.out.println("El producto mas vendido es completo");
                } else {
                    if (si >= sf && si >= se && si >= st && si >= sd && si >= sc && si >= sb && si >= sa) {
                        System.out.println("El producto mas vendido es churrasco");
                    } else {
                        if (sd >= sf && sd >= se && sd >= si && sd >= st && sd >= sc && sd >= sb && sd >= sa) {
                            System.out.println("El producto mas vendido es dulces");
                        } else {
                            if (sc >= sf && sc >= se && sc >= si && sc >= sd && sc >= st && sc >= sb && sc >= sa) {
                                System.out.println("El producto mas vendido es cafe");
                            } else {
                                if (sb >= sf && sb >= se && sb >= si && sb >= sd && sb >= sc && sb >= st && sb >= sa) {
                                    System.out.println("El producto mas vendido es bebidas");
                                } else {
                                    if (sa >= sf && sa >= se && sa >= si && sa >= sd && sa >= sc && sa >= sb && sa >= st) {
                                        System.out.println("El producto mas vendido es agua");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
