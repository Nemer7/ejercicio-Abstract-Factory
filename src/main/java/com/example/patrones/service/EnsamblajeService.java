package com.example.patrones.service;


import com.example.patrones.abstractfactory.*;
import com.example.patrones.abstractfactory.VehiculoFactory;
import com.example.patrones.model.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EnsamblajeService {

    public Vehiculo ensamblarVehiculo(String marca, String color, int numeroEjes, String chasisPieza, String transmision,
                                      int potenciaMaxima, String motorPieza, String tecnologia,
                                      String cojineriaPieza, String materialCojineria, String numeroEnsamblaje) {

        VehiculoFactory factory;
        switch (marca.toLowerCase()) {
            case "toyota":
                factory = new ToyotaFactory();
                break;
            case "ford":
                factory = new FordFactory();
                break;
            case "mazda":
                factory = new MazdaFactory();
                break;
            default:
                throw new IllegalArgumentException("Marca no soportada");
        }


        Chasis chasis = new Chasis(numeroEjes, chasisPieza, transmision);
        Motor motor = new Motor(potenciaMaxima, motorPieza, tecnologia);
        Cojin cojinera = new Cojin(cojineriaPieza, materialCojineria);


        LocalDate fechaEnsamblaje = LocalDate.now();

        return new Vehiculo(chasis, motor, cojinera, color, fechaEnsamblaje, numeroEnsamblaje);
    }

}
