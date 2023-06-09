package com.info.fut5app.service.crear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.info.fut5app.domain.Jugador;

public class IndexarJugadores {
	
	static List<Jugador> listaDeJugadores = new ArrayList<>();
	static int cantJugadores;
	
	public static List<Jugador> listarJugadores(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de jugadores: ");
		cantJugadores = entrada.nextInt();
		
		for(int i=0; i<cantJugadores; i++) {
			listaDeJugadores.add(AgregarJugador.crearJugador());
		}
		
		for(Jugador jugador: listaDeJugadores) {
			System.out.println("Jugador: "+jugador.getNombre()+ " - "+jugador.getPosicion()+" - Equipo: ");
		}
		return listaDeJugadores;
	}

}
