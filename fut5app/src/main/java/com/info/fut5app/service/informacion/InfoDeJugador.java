package com.info.fut5app.service.informacion;

import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class InfoDeJugador {
	
	static int cantGoles, cantPartidos, numCamiseta;
	
	public static int goles() {
		System.out.println("Ingrese la Cantidad de Goles: ");
		cantGoles = IngresoPorScanner.entradaDeNumero();
		return cantGoles;
	}
	
	public static int partidos() {
		System.out.println("¿Cuántos Partidos ha Jugado?");
		cantPartidos = IngresoPorScanner.entradaDeNumero();
		return cantPartidos;
	}
	
	public static int camiseta() {
		System.out.println("Ingrese Número de Camiseta: ");
		numCamiseta = IngresoPorScanner.entradaDeNumero();
		return numCamiseta;
	}

}
