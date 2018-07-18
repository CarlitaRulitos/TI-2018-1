package com.carlitarulitos;

public class ListaAviones {
    private Avion listaAviones[];
    private int pLibre;

    public ListaAviones(int n){
        listaAviones = new Avion[n];
    }

    // Recibe el id de un avion.
    // Retorna la posicion en la lista del avion.
    // Si el avion no esta, retorna pLibre.
    private int buscarAvion(int id){
        int i;
        for(i = 0; i < pLibre; i++){
            if(listaAviones[i].getId() == id){
                return i;
            }
        }
        return i;
    }

    public boolean agregarAvion(Avion avion){
        if(pLibre == listaAviones.length){
            return false;
        }
        if(buscarAvion(avion.getId()) < pLibre){
            return false;
        }
        listaAviones[pLibre] = avion;
        pLibre += 1;
        return true;
    }

    // Retorna true si encontro el avion y lo elimino.
    // false en otro caso.
    public boolean eliminarAvion(int id){
        int pos = buscarAvion(id);
        if(pos == pLibre){
            return false;
        }
        for(int i = pos; i < pLibre; i++){
            listaAviones[i] = listaAviones[i+1];
        }
        pLibre -= 1;
        return true;
    }

    public boolean eliminarAvion(Avion avion){
        return this.eliminarAvion(avion.getId());
    }

    public AvionPrivado elMasConsumista(){
        AvionPrivado consumista = null;
        double cantidad = 0;
        for(int i = 0; i < pLibre; i++){
            if(listaAviones[i] instanceof AvionPrivado){
                if(listaAviones[i].getConsumoEnergia() > cantidad){
                    cantidad = listaAviones[i].getConsumoEnergia();
                    consumista = (AvionPrivado) listaAviones[i];
                }
            }
        }
        return consumista;
    }


    public String marcaComercialMasConsumista(){
        String marcaConsumista = "";
        double loQueConsume = 0;

        for(int i = 0; i < pLibre; i++){
            if(listaAviones[i].getConsumoEnergia() > loQueConsume){
                loQueConsume = listaAviones[i].getConsumoEnergia();
                marcaConsumista = listaAviones[i].getMarca();
            }
        }

        return marcaConsumista;
    }

    public String marcaPrivadaMenosConsumista(){
        String marcaNoConsumista = "";
        double loQueConsume = 999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0;

        for(int i = 0; i < pLibre; i++){
            if(listaAviones[i].getConsumoEnergia() < loQueConsume){
                loQueConsume = listaAviones[i].getConsumoEnergia();
                marcaNoConsumista = listaAviones[i].getMarca();
            }
        }

        return marcaNoConsumista;
    }

    public Avion[] eliminarPorModelo(String modelo){
        Avion eliminados[] = new Avion[pLibre];
        int eliminados_libre = 0;

        for(int i = pLibre-1; i >= 0; i--){
            if(listaAviones[i].getModelo().equals(modelo)){
                eliminados[eliminados_libre] = listaAviones[i];
                if(eliminarAvion(listaAviones[i])){
                    eliminados_libre += 1;
                }
            }
        }

        return eliminados;
    }

    public Avion[] eliminarPorModeloEImprimir(String modelo){
        Avion eliminados[] = this.eliminarPorModelo(modelo);
        for(int i = 0; i < eliminados.length; i++){
            System.out.println(eliminados[i].getId());
        }
        return eliminados;
    }

}
