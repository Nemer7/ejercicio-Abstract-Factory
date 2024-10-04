package com.example.patrones.controller;

import com.example.patrones.model.Vehiculo;
import com.example.patrones.service.EnsamblajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private EnsamblajeService ensamblajeService;

    @PostMapping("/ensamblar")
    public String ensamblarVehiculo(
            @RequestParam String marca,
            @RequestParam String color,
            @RequestParam int numeroEjes,
            @RequestParam String chasisPieza,
            @RequestParam String transmision,
            @RequestParam int potenciaMaxima,
            @RequestParam String motorPieza,
            @RequestParam String tecnologia,
            @RequestParam String cojineriaPieza,
            @RequestParam String materialCojineria,
            @RequestParam String numeroEnsamblaje) {

        try {
            Vehiculo vehiculo = ensamblajeService.ensamblarVehiculo(marca, color, numeroEjes, chasisPieza, transmision,
                    potenciaMaxima, motorPieza, tecnologia,
                    cojineriaPieza, materialCojineria, numeroEnsamblaje);
            return vehiculo.toString();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

}
