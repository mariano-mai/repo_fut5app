package com.info.fut5app.service.crear.jugador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.info.fut5app.domain.Jugador;

public class MapearJugador {
	
	public static Map<String,String> mapaDeJugadores = new HashMap<>();
		
	public static Map infoDeJugadores() {
		for(Jugador jugador : IndexarJugadores.jugadores) {
			mapaDeJugadores.put("Nombre", AgregarJugador.jugador.getNombre());
			mapaDeJugadores.put("Apellido", AgregarJugador.jugador.getApellido());
			mapaDeJugadores.put("Posición", AgregarJugador.jugador.getPosicion());
			mapaDeJugadores.put("Es Capitán", AgregarJugador.jugador.getEsCapitan());
			mapaDeJugadores.put("Equipo", AgregarJugador.jugador.getEquipo());
		}
		return mapaDeJugadores;
	}
	

}
