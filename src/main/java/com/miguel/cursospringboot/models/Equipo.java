package com.miguel.cursospringboot.models;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> plantilla;


    public Equipo(){
        plantilla= new ArrayList<>();
    }
    public Equipo(String nombre, List<Jugador> plantilla) {
        this.nombre = nombre;
        this.plantilla = plantilla;
    }

    public List<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(List<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugadorPlantilla(Jugador jugador){
        plantilla.add(jugador);
    }
}

