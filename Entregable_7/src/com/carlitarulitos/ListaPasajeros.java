package com.carlitarulitos;

public class ListaPasajeros {
    private NodoPasajero head;

    public ListaPasajeros(){
        head= new NodoPasajero(null,null);
    }
    public boolean buscarPasajero(String rut){
        NodoPasajero rec=head.getSig();
        while(rec!=null){
            if (rec.getPasajero().getRut().equals(rut)){
                return true;
            }
            rec=rec.getSig();
        }
        return false;
    }

    public int contarAsientosPasajeros(int numero){
        int cont=0;
        NodoPasajero rec=head.getSig();
        while(rec!=null){
            cont=cont+rec.getPasajero().contarAsientos(numero);
            rec=rec.getSig();
        }
        return cont;
    }

    public void annadirPasajeros(Pasajero nuevo){
        NodoPasajero rec=head;
        while (rec.getSig()!=null){
            rec=rec.getSig();
        }
        rec.setSig(new NodoPasajero(nuevo,null));
    }







}