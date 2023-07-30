package com.info.fut5app.service.crear.jugador;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.info.fut5app.domain.Equipo;
import com.info.fut5app.domain.Jugador;
import com.info.fut5app.service.crear.AgregarEquipo;
import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class AgregarJugador {
	
	public static Jugador jugador;
	
	public static Jugador crearJugador() {
		jugador = new Jugador(Equipo.getNombreDeEquipo());
				
		System.out.println("Ingrese el nombre del jugador: ");
		jugador.setNombre(IngresoPorScanner.entradaDeTexto());
		//System.out.println("Ingrese apellido del jugador: ");
		//jugador.setApellido(IngresoPorScanner.entradaDeTexto());
		
		jugador.setPosicion(AsignaPosicion.darPosicion());
		
		jugador.setId(UUID.randomUUID());
		
		//System.out.println("Ingrese altura en cm: ");
		//jugador.setAltura(IngresoPorScanner.entradaDeNumero());
		
		//System.out.println("Ingrese el número de camiseta del jugador: ");
		//jugador.setNumeroCamiseta(IngresoPorScanner.entradaDeNumero());
		
		jugador.setEsCapitan(CondicionalEsCapitan.defineCapitania());
		
		//System.out.println("Ingrese la cantidad de partidos jugados por este jugador: ");
		//jugador.setCantPartidosJugados(IngresoPorScanner.entradaDeNumero());
		
		//System.out.println("Ingrese la cantidad de goles metidos por este jugador: ");
		//jugador.setCantGoles(IngresoPorScanner.entradaDeNumero());
		
		return jugador;
	} //final de método crearJugador

}
