package com.example.patrones.model;

public  class Motor {

    private  double potenciaMaxima;
    private String numeroPieza;
    private String tecnologia;

    public Motor(int potenciaMaxima, String numeroPieza, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.numeroPieza = numeroPieza;
        this.tecnologia = tecnologia;
    }


    public String getDescripcion() {
        return "Motor con " + potenciaMaxima + " HP, Número de pieza: " + numeroPieza + ", Tecnología: " + tecnologia;
    }

}
