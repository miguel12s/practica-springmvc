package com.miguel.cursospringboot.services;

import com.miguel.cursospringboot.models.Equipo;
import com.miguel.cursospringboot.models.Jugador;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class EquipoInglaterraService implements IService{

    @Override
    public List<Equipo> getEquipos() {
        Equipo manchesterUnited = new Equipo();
        manchesterUnited.setNombre("manchesterUnited");
        manchesterUnited.agregarJugadorPlantilla(new Jugador("alejandro garnacho", 1));
        manchesterUnited.agregarJugadorPlantilla(new Jugador("bruno fernandez", 2));

        Equipo manchesterCity = new Equipo();
        manchesterCity.setNombre("manchesterCity");
        manchesterCity.agregarJugadorPlantilla(new Jugador("erling halaand", 7));
        manchesterCity.agregarJugadorPlantilla(new Jugador("julian alvarez", 11));


        return List.of(manchesterUnited, manchesterCity);
    }
}
