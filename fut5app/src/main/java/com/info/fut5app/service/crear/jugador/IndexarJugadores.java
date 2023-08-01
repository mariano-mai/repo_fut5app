package com.info.fut5app.service.crear.jugador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.info.fut5app.domain.Jugador;
import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class IndexarJugadores {
	
	public static List<Jugador> jugadores;
	static int cantJugadores;
	static Map<String, String> mapaDeJugadores;
	
	public static List<Jugador> listarJugadores(){
		jugadores = new ArrayList<>();
		
		System.out.println("Ingrese la cantidad de jugadores: ");
		cantJugadores = IngresoPorScanner.entradaDeNumero();
		
		for(int i=0; i<cantJugadores; i++) {
			jugadores.add(AgregarJugador.crearJugador());
		}
		
		return jugadores;
	}
	
	public static void muestraJugadores() {
		mapaDeJugadores = new HashMap<>();
		
		for(Jugador jugador: jugadores) {
			mapaDeJugadores.put("nombre de equipo", jugador.getNombre());
		}
		for(Jugador elemento: jugadores) {
			System.out.println(elemento.getNombre());
		}
		
	}

}
