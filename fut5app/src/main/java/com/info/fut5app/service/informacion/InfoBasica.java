package com.info.fut5app.service.informacion;

import java.time.LocalDate;
import java.time.Month;

import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class InfoBasica {
	
	static String nombre, apellido;
	static int edad, altura;
	static LocalDate fecha;
	
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
	
	public static LocalDate fecha() {
		System.out.println("INGRESE DÍA: ");
		int diaDelMes = IngresoPorScanner.entradaDeNumero();
		System.out.println("INGRESE MES (número): ");
		Month mes = Month.of(IngresoPorScanner.entradaDeNumero());
		System.out.println("INGRESE AÑO: ");
		int agno = IngresoPorScanner.entradaDeNumero();
		
		fecha = LocalDate.of(agno, mes, diaDelMes);
		return fecha;
	}

}
