package com.example.patrones.abstractfactory;

import com.example.patrones.model.*;

public class MazdaFactory implements  VehiculoFactory{

    @Override
    public Chasis crearChasis(int numeroEjes, String numeroPieza, String tipoTransmision) {
        return new Chasis(numeroEjes, numeroPieza, tipoTransmision);
    }

    @Override
    public Motor crearMotor(int potenciaMaxima, String numeroPieza, String tecnologia) {
        return new Motor(potenciaMaxima, numeroPieza, tecnologia);
    }

    @Override
    public Cojin crearCojinera(String numeroPieza, String material) {
        return new Cojin(numeroPieza, material);
    }
}
