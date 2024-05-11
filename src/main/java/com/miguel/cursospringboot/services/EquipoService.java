package com.miguel.cursospringboot.services;

import com.miguel.cursospringboot.models.Equipo;
import com.miguel.cursospringboot.models.Jugador;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("equipoEspaña")
public class EquipoService implements IService {

    public List<Equipo> getEquipos(){
        Equipo barcelona = new Equipo();
        barcelona.setNombre("barcelona");
        barcelona.agregarJugadorPlantilla(new Jugador("joao felix", 1));
        barcelona.agregarJugadorPlantilla(new Jugador("pau cubarsi", 2));
        barcelona.agregarJugadorPlantilla(new Jugador("ter stegen", 3));
        barcelona.agregarJugadorPlantilla(new Jugador("lewandoski", 9));
        barcelona.agregarJugadorPlantilla(new Jugador("fermin lopez", 15));

        Equipo realMadrid = new Equipo();
        realMadrid.setNombre("realMadrid");
        realMadrid.agregarJugadorPlantilla(new Jugador("vinicius junior", 7));
        realMadrid.agregarJugadorPlantilla(new Jugador("rodrigo goes ", 11));
        realMadrid.agregarJugadorPlantilla(new Jugador("kylian mbappe", 9));
        realMadrid.agregarJugadorPlantilla(new Jugador("luka modric", 10));
        realMadrid.agregarJugadorPlantilla(new Jugador("tony kross", 22));


        return List.of(barcelona, realMadrid);
    }
}
