package com.example.patrones.model;

public  class Cojin {

    private String numeroPieza;
    private String material;

    public Cojin(String numeroPieza, String material) {
        this.numeroPieza = numeroPieza;
        this.material = material;
    }

    public String getDescripcion() {
        return "Cojinera de material: " + material + ", Número de pieza: " + numeroPieza;
    }
}
