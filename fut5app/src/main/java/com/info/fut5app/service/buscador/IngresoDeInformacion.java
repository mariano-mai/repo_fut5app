package com.info.fut5app.service.buscador;

import java.util.Scanner;

public class IngresoDeInformacion {
	static Scanner entrada = new Scanner(System.in);
	static String nombre = "";
	static String apellido = "";
	
	public static String ingresarNombre() {
		//Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESE EL NOMBRE: ");
		nombre = entrada.nextLine();
		return nombre;
	}
	
	public static String ingresarApellido() {
		//Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESE EL APELLIDO: ");
		apellido = entrada.nextLine();
		return apellido;
	}

}
