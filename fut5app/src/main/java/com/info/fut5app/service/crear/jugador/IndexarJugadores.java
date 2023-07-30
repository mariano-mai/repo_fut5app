package com.info.fut5app.service.crear.jugador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.info.fut5app.domain.Jugador;
import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class IndexarJugadores {
	
	public static List<Jugador> jugadores = new ArrayList<>();
	static int cantJugadores;
	
	public static List<Jugador> listarJugadores(){
				
		MapearJugador.mapaDeJugadores = new HashMap<>();
		
		System.out.println("Ingrese la cantidad de jugadores: ");
		cantJugadores = IngresoPorScanner.entradaDeNumero();
		
		for(int i=0; i<cantJugadores; i++) {
			jugadores.add(AgregarJugador.crearJugador());
			MapearJugador.infoDeJugadores();
		}
		//esto imprime nomás, es para ver si funciona
		for(Jugador jugador: jugadores) {
			System.out.println("Jugador: "+jugador.getNombre()+" - Es capitán: "+jugador.getEsCapitan()+ " - "+jugador.getPosicion()+" - Equipo: "+jugador.getEquipo());
		}
		System.out.println("MAPA DE LOS JUGADORES:");
		System.out.println(MapearJugador.infoDeJugadores().values());
		return jugadores;
	}
	

}
