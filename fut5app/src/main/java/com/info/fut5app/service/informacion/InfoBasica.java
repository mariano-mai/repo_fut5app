package com.info.fut5app.service.informacion;

import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class InfoBasica {
	
	static String nombre, apellido;
	static int edad, altura;
	
	public static String nombrar() {
		System.out.println("INGRESE NOMBRE: ");
		nombre = IngresoPorScanner.entradaDeTexto();
		return nombre;
	}
	
	public static String darApellido() {
		System.out.println("INGRESE APELLIDO: ");
		apellido = IngresoPorScanner.entradaDeTexto();
		return apellido;
	}
	
	public static int darEdad() {
		System.out.println("INGRESE LA EDAD: ");
		edad = IngresoPorScanner.entradaDeNumero();
		return edad;
	}
	
	public static int darAltura() {
		System.out.println("INGRESE ALTURA EN CM: ");
		altura = IngresoPorScanner.entradaDeNumero();
		return altura;
	}

}
