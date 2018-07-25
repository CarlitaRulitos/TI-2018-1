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

    public void reasignarPasajeros(Avion[] nuevos_aviones, int numero_antiguo){
        NodoPasajero rec = head.getSig();
        int cantidad_aviones_eliminados = 0;
        int dispo_avion = 0;
        while(rec != null){
            cantidad_aviones_eliminados = rec.getPasajero().quitarVuelo(numero_antiguo);
            for(int i = 0; i < nuevos_aviones.length && cantidad_aviones_eliminados > 0; i++){
                dispo_avion = nuevos_aviones[i].getCantPasajeros() - contarAsientosPasajeros(nuevos_aviones[i].getNumero());
                if(dispo_avion >= cantidad_aviones_eliminados){
                    rec.getPasajero().asignarVuelo(nuevos_aviones[i], cantidad_aviones_eliminados);
                    cantidad_aviones_eliminados = 0;
                }
                else{
                    rec.getPasajero().asignarVuelo(nuevos_aviones[i], dispo_avion);
                    cantidad_aviones_eliminados -= dispo_avion;
                }
            }
            rec = rec.getSig();
        }
    }

    public void ordenarPorEdad(){
        Pasajero aux;
        NodoPasajero rec = head.getSig(), rec2;
        while(rec != null){
            rec2 = head.getSig();
            while(rec2 != null){
                if(rec2.getSig() != null){
                    if(rec2.getSig().getPasajero().getEdad() < rec2.getPasajero().getEdad()){
                        aux = rec2.getSig().getPasajero();
                        rec2.getSig().setPasajero(rec2.getPasajero());
                        rec2.setPasajero(aux);
                    }
                }
                rec2 = rec2.getSig();
            }
            rec = rec.getSig();
        }
    }



}