package com.info.fut5app.service.menu;

import java.util.Scanner;

import com.info.fut5app.service.crear.AgregarEquipo;
import com.info.fut5app.service.crear.CondicionalAgregarEquipo;
import com.info.fut5app.service.finDePrograma.SalirDePrograma;

public class MenuDeOpciones {
	
	static int opcion;
	
	public static void darOpciones() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nBIENVENIDO AL MENÚ\n");
		System.out.println("SELECCIONE UNA OPCIÓN");
		
		System.out.println("0 - SALIR\n1 - AGREGAR EQUIPO");	
		opcion = entrada.nextInt();
		
		switch(opcion) {
		case 0:
			SalirDePrograma.terminarEjecucion();
			break;
		case 1:
			CondicionalAgregarEquipo.creaUnEquipo();
			break;
		}
	}

}
