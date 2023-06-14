package com.info.fut5app.service.crear;

import java.util.Scanner;

public class NombreDeEquipo {
	static String nombre = "";
	
	public static String nombrarEquipo() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del equipo: ");
		nombre = entrada.nextLine();
		return nombre;
	}
	

}
