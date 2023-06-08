package com.info.fut5app.service.crear;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import com.info.fut5app.domain.Jugador;

public class AgregarJugador {
	
	public static Jugador crearJugador() {
		Jugador jugador = new Jugador();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del jugador: ");
		jugador.setNombre(entrada.nextLine());
		//System.out.println("Ingrese apellido del jugador: ");
		//jugador.setApellido(entrada.nextLine());
		
		jugador.setPosicion(AsignaPosicion.darPosicion());
		
		jugador.setId(UUID.randomUUID());
		
		//System.out.println("Ingrese altura en cm: ");
		//jugador.setAltura(entrada.nextInt());
		
		//System.out.println("Ingrese el número de camiseta del jugador: ");
		//jugador.setNumeroCamiseta(entrada.nextInt());
		
		jugador.setEsCapitan(EsCapitan.esCapitan());
		
		//System.out.println("Ingrese la cantidad de partidos jugados por este jugador: ");
		//jugador.setCantPartidosJugados(entrada.nextInt());
		
		//System.out.println("Ingrese la cantidad de goles metidos por este jugador: ");
		//jugador.setCantGoles(entrada.nextInt());
		
		Map<String,String> jugadores = new HashMap<String,String>();
		
		jugadores.put("ID", jugador.getId()+"");
		jugadores.put("Nombre del Jugador", jugador.getNombre());
		//jugadores.put("Apellido del Jugador", jugador.getApellido());
		//jugadores.put("Altura del Jugador", jugador.getAltura()+"");
		jugadores.put("Posición del Jugador", jugador.getPosicion());
		jugadores.put("Es capitán", jugador.getEsCapitan());
		//jugadores.put("Número de Camiseta", jugador.getNumeroCamiseta()+"");
		//jugadores.put("Cantidad de partidos jugados", jugador.getCantPartidosJugados()+"");
		//jugadores.put("Cantidad de Goles", jugador.getCantGoles()+"");
		
		
		System.out.println(jugadores.toString());
		return jugador;
	} //final de método crearJugador

}
