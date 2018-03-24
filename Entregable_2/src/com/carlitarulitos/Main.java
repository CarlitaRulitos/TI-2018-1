import java.io.*;

public class Cafeta {
    public static void main(String[] arg) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        boolean con = false;
        String r, n, ;
        int x, sanoe = 0, sanoa = 0, sanof = 0, e = 0, p = 0, t = 0, i = 0, d = 0, c = 0, b = 0, a = 0, sano = 0;
        int se = 0, sp = 0, st = 0, si = 0, sd = 0, sc = 0, sb = 0, sa = 0;

        while (con == false) {
            System.out.println("¿Desea ingresar cliente? Responda SI para ingresar, NO para finalizar");
            r = leer.readLine();

            if (r.equal("SI") { //Revisar igualar string
                System.out.println("Ingrese nombres y rut separados por espacios");
                n = leer.readline();

                System.out.println("Ingrese producto");
                System.out.println("1 para ensalada ave");
                System.out.println("2 para pote de frutas");
                System.out.println("3 completo");
                System.out.println("4 churrasco");
                System.out.println("5 dulce");
                System.out.println("6 cafe");
                System.out.println("7 bebida");
                System.out.println("8 agua");
                System.out.println("9 salir");

                x = Integer.parseInt(leer.readline());

                switch (x) {

                    case 1:
                        System.out.println("Ingrese cantidad");
                        e = Intger.parse Int

                    case 2:


                    case 3:


                    case 4:


                    case 5:


                    case 6:


                    case 7:

                    case 8:

                    case 9:


                }
            }
        }
    }
}
