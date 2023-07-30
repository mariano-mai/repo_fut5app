package com.info.fut5app.service.informacion;

import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class InfoDeJugador {
	
	static int cantGoles, cantPartidos, numCamiseta;
	
	public static int goles() {
		System.out.println("INGRESE CANTIDAD DE GOLES: ");
		cantGoles = IngresoPorScanner.entradaDeNumero();
		return cantGoles;
	}
	
	public static int partidos() {
		System.out.println("¿CUÁNTOS PARTIDOS HA JUGADO?");
		cantPartidos = IngresoPorScanner.entradaDeNumero();
		return cantPartidos;
	}
	
	public static int camiseta() {
		System.out.println("INGRESE NÚMERO DE CAMISETA: ");
		numCamiseta = IngresoPorScanner.entradaDeNumero();
		return numCamiseta;
	}

}
