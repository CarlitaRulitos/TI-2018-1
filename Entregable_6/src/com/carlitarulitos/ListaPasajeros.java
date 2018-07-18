package com.carlitarulitos;

public class ListaPasajeros {
    private Pasajero listaPasajeros[];
    private int pLibre;

    public ListaPasajeros(int n){
        listaPasajeros = new Pasajero[n];
    }

    public boolean agregarPasajero(Pasajero pasajero){
        if(pLibre == listaPasajeros.length){
            return false;
        }
        listaPasajeros[pLibre] = pasajero;
        pLibre += 1;
        return true;
    }

    public Pasajero[] diesPasajerosConMasVuelos(){
        int tamano = 10;
        int contados = 0;
        int menor = 0, pos = 0;
        if(pLibre < tamano){
            tamano = pLibre;
        }
        Pasajero[] masVuelos = new Pasajero[tamano];

        for(int i = 0; i < listaPasajeros.length; i++){
            contados = listaPasajeros[i].contarVuelos();

            for(int j = 0; j < masVuelos.length; j++){
                if(masVuelos[j] == null){
                    pos = j;
                    menor = 0;
                }
                else if(j == 0){
                    pos = j;
                    menor = 0;
                }
                else{
                    if(masVuelos[j].contarVuelos() < menor){
                        menor = masVuelos[j].contarVuelos();
                        pos = j;
                    }
                }
            }
            if(contados > menor){
                masVuelos[pos] = listaPasajeros[i];
            }
        }

        return masVuelos;
    }

    // Calcula la media de viajes por pasajero.
    private double determinarMedia(){
        double suma = 0;
        for(int i = 0; i < pLibre; i++){
            suma += listaPasajeros[i].contarVuelos();
        }
        return suma/pLibre;
    }

    // Recibe la posicion de un pasajero en la lista de pasajeros. Lo elimina.
    private boolean eliminarPasajero(int pos){
        if(pos >= pLibre){
            return false;
        }
        for(int i = pos; i < pLibre; i++){
            listaPasajeros[i] = listaPasajeros[i+1];
        }
        pLibre -= 1;
        return true;
    }

    // Retorna la cantidad de pasajeros eliminados
    public int eliminarBajoLaMedia(){
        int eliminados = 0;
        double media = determinarMedia();
        for(int i = pLibre-1; i >= 0; i--){
            if(listaPasajeros[i].contarVuelos() < media){
                if(eliminarPasajero(i)){
                    eliminados += 1;
                }
            }
        }
        return eliminados;
    }

}
