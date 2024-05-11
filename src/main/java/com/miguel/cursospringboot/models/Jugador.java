package com.miguel.cursospringboot.models;

public class Jugador {
    private String nombre;
    private Integer numeroEquipo;

    public Jugador(String nombre, Integer numeroEquipo) {
        this.nombre = nombre;
        this.numeroEquipo = numeroEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroEquipo() {
        return numeroEquipo;
    }

    public void setNumeroEquipo(Integer numeroEquipo) {
        this.numeroEquipo = numeroEquipo;
    }
}
