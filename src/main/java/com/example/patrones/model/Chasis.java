package com.example.patrones.model;

public    class  Chasis{
    private int numeroEjes;
    private String numeroPieza;
    private  String tipoTrasmision;

    public Chasis(int numeroEjes, String numeroPieza, String tipoTrasmision) {
        this.numeroEjes = numeroEjes;
        this.numeroPieza = numeroPieza;
        this.tipoTrasmision = tipoTrasmision;
    }

    public String getDescripcion(){
     return "Chasis con " + numeroEjes +" ejes, Numero de pieza: "+ numeroPieza +", Trasmision: "+ tipoTrasmision;
    }
}
