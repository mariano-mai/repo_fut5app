package com.info.fut5app.service.crear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.info.fut5app.domain.Jugador;

public class AgregarJugador {
	
	public static Jugador crearJugador() {
		Jugador jugador = new Jugador();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del jugador: ");
		jugador.setNombre(entrada.nextLine());
		System.out.println("Ingrese apellido del jugador: ");
		jugador.setApellido(entrada.nextLine());
		
		jugador.setPosicion(AsignaPosicion.darPosicion());
		
		Map<String,String> jugadores = new HashMap<String,String>();
		
		jugadores.put("Nombre del Jugador", jugador.getNombre());
		jugadores.put("Apellido del Jugador", jugador.getApellido());
		jugadores.put("Posición del Jugador", jugador.getPosicion());
		
		System.out.println(jugadores.toString());
		return jugador;
	} //final de método crearJugador

}
