package com.carlitarulitos;

public class ListaAviones {
    private NodoAvion head;

    public ListaAviones(){
        head = null;
    }

    public Avion buscarAvion(int numero){
        NodoAvion rec = head;
        while(rec != null){
            if(rec.getAvion().getNumero() == numero){
                return rec.getAvion();
            }
            rec = rec.getSig();
        }
        return  null;
    }

    public Avion[] getAvionesDestino(String destino, int num){
        int cont = 0;
        NodoAvion rec = head;
        while(rec != null){
            if(rec.getAvion() instanceof AvionComercial){
                if(rec.getAvion().getDestino().equals(destino)){
                    if(rec.getAvion().getNumero()!= num){
                        cont++;
                    }
                }
            }
            rec = rec.getSig();
        }

        if(cont > 0){
            rec = head;
            Avion avionesDetino[] = new Avion[cont];
            int i = 0;
            while(rec != null){
                if(rec.getAvion() instanceof AvionComercial){
                    if(rec.getAvion().getDestino().equals(destino)){
                        if(rec.getAvion().getNumero() != num){
                            avionesDetino[i] = rec.getAvion();
                            i++;
                        }
                    }
                }
                rec = rec.getSig();
            }
            return avionesDetino;
        }
        return null;
    }

    public void eliminarAvion(int num){
        if(head != null){
            if(head.getAvion().getNumero() == num){
                head = head.getSig();
                return;
            }
            NodoAvion rec = head;
            while(rec.getSig()!=null){
                if(rec.getSig().getAvion().getNumero() == num){
                    rec.setSig(rec.getSig().getSig());
                    return;
                }
                rec = rec.getSig();
            }
        }
    }

    public Avion[] avionComercialQueMasConsume(){
        double mayor = 0;
        int lugar = 0;
        int total = 0;
        NodoAvion rec = head;
        while(rec != null){
            if(rec.getAvion() instanceof AvionComercial){
                if(rec.getAvion().consumoCombustible() > mayor){
                    mayor = rec.getAvion().consumoCombustible();
                    total++;
                }
            }
            rec = rec.getSig();
        }

        rec = head;
        Avion[] avionsitos = new AvionComercial[total];
        while(rec != null){
            if(rec.getAvion() instanceof AvionComercial){
                if(Math.abs(rec.getAvion().consumoCombustible() - mayor) < 0.0000001){
                    avionsitos[lugar] = rec.getAvion();
                    lugar++;
                }
            }
            rec = rec.getSig();
        }

        return avionsitos;
    }

    public double promedioConsumoCarga(){
        double suma = 0;
        int total = 0;
        NodoAvion rec = head;

        while(rec != null){
            if(rec.getAvion() instanceof AvionCarga){
                suma += rec.getAvion().consumoCombustible();
                total++;
            }
            rec = rec.getSig();
        }

        if(total == 0){
            return 0;
        }
        return suma/total;
    }
}
