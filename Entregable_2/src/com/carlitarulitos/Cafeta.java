import java.io.*;

public class Cafeta {
    public static void main(String[] arg) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        boolean con;
        String r, n;
        int x, sanoe = 0, sanoa = 0, sanof = 0, e = 0, f = 0, t = 0, i = 0, d = 0, c = 0, b = 0, a = 0, sano = 0;
        int se = 0, sf = 0, st = 0, si = 0, sd = 0, sc = 0, sb = 0, sa = 0;

        System.out.println("¿Desea ingresar cliente? Responda SI para ingresar, NO para finalizar");
        r = leer.readLine();
        if (r.equals("SI")){
            con=false;

            while (con == false) { //nuevo cliente



                System.out.println("Ingrese nombres y rut separados por espacios");
                n = leer.readLine();

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
                        sanoe = e+ sanoe;
                        se= e+ se;
                        break;

                    case 2:
                        System.out.println("Ingrese cantidad");
                        f = Integer.parseInt(leer.readLine());
                        sanof = f+ sanof;
                        sf= f+ sf;
                        break;

                    case 3:
                        System.out.println("Ingrese cantidad");
                        t = Integer.parseInt(leer.readLine());
                        st= t+ st;
                        break;

                    case 4:
                        System.out.println("Ingrese cantidad");
                        c = Integer.parseInt(leer.readLine());
                        sc= c+ sc;
                        break;

                    case 5:
                        System.out.println("Ingrese cantidad");
                        d = Integer.parseInt(leer.readLine());
                        sd= d+ sd;
                        break;

                    case 6:
                        System.out.println("Ingrese cantidad");
                        c = Integer.parseInt(leer.readLine());
                        sc= c+ sc;
                        break;

                    case 7:
                        System.out.println("Ingrese cantidad");
                        b = Integer.parseInt(leer.readLine());
                        sb= b+ sb;
                        break;

                }
            }
        else{
                System.out.println("No ingresó datos, así que no hay producto mejor vendido, o cliente más sano.");
            }

        }
    }
}
