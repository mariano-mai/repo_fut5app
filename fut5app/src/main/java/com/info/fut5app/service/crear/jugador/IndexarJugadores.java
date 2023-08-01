package com.info.fut5app.service.crear.jugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.info.fut5app.domain.Jugador;
import com.info.fut5app.service.entrada.consola.IngresoPorScanner;
import com.info.fut5app.service.menu.VolverAMenu;

public class IndexarJugadores {
	
	public static List<Jugador> jugadores = new ArrayList<>();
	static int cantJugadores;
	static Map<String, String> mapaDeJugadores;
	
	public static List<Jugador> listarJugadores(){
		//jugadores = new ArrayList<>();
		
		System.out.println("Ingrese la cantidad de jugadores: ");
		cantJugadores = IngresoPorScanner.entradaDeNumero();
		
		for(int i=0; i<cantJugadores; i++) {
			jugadores.add(AgregarJugador.crearJugador());
		}
		
		return jugadores;
	}
	
	public static void muestraJugadores() {
		System.out.println("Jugadores Existentes\n");
		for(int i=0; i<jugadores.size(); i++) {
			System.out.println(jugadores.get(i).getNombre()+" "+jugadores.get(i).getApellido());
		}
		
		VolverAMenu.retornar();
	}

}
