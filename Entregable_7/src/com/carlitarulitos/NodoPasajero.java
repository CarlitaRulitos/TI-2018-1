package com.carlitarulitos;

public class NodoPasajero {
    private Pasajero pasajero;
    private NodoPasajero sig;

    public NodoPasajero(Pasajero p, NodoPasajero np){
        pasajero=p;
        sig=np;
    }

    public Pasajero getPasajero(){
        return pasajero;
    }

    public NodoPasajero getSig() {
        return sig;
    }

    public void setSig(NodoPasajero sig) {
        this.sig = sig;
    }
}
