package com.example.patrones.abstractfactory;

import com.example.patrones.model.*;

public interface VehiculoFactory {

    Chasis crearChasis(int numeroEjes, String numeroPieza, String tipoTransmision);
    Motor crearMotor(int potenciaMaxima, String numeroPieza, String tecnologia);
    Cojin crearCojinera(String numeroPieza, String material);

}
