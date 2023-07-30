package com.info.fut5app.service.crear;


import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class NombreDeEquipo {
	static String nombre = "";
	
	public static String nombrarEquipo() {
		
		System.out.println("Ingrese el nombre del equipo: ");
		nombre = IngresoPorScanner.entradaDeTexto();
		return nombre;
	}
	

}
