package com.example.patrones.model;

import java.time.LocalDate;

public class Vehiculo {

        private Chasis chasis;
        private Motor motor;
        private Cojin cojinera;
        private String color;
        private LocalDate fechaEnsamblaje;
        private String numeroEnsamblaje;

        public Vehiculo(Chasis chasis, Motor motor, Cojin cojinera, String color, LocalDate fechaEnsamblaje, String numeroEnsamblaje) {
            this.chasis = chasis;
            this.motor = motor;
            this.cojinera = cojinera;
            this.color = color;
            this.fechaEnsamblaje = fechaEnsamblaje;
            this.numeroEnsamblaje = numeroEnsamblaje;
        }

        @Override
        public String toString() {
            return "Vehiculo ensamblado con: \n" +
                    chasis.getDescripcion() + "\n" +
                    motor.getDescripcion() + "\n" +
                    cojinera.getDescripcion() + "\n" +
                    "Color: " + color + "\n" +
                    "Fecha de ensamblaje: " + fechaEnsamblaje + "\n" +
                    "Número de ensamblaje: " + numeroEnsamblaje;
        }
}
