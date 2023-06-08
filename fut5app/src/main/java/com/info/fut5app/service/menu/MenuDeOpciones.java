package com.info.fut5app.service.menu;

import java.util.Scanner;

import com.info.fut5app.service.crear.AgregarEquipo;
import com.info.fut5app.service.finDePrograma.SalirDePrograma;

public class MenuDeOpciones {
	
	static String[] listaDeOpciones = { "Salir", "Añadir Equipo"};
	static int i = 0;
	static int opcion;
	
	public static void darOpciones() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Seleccione una opción");
		for(String opcion: listaDeOpciones) {
			System.out.println(i+" - "+listaDeOpciones[i]);
			i++;
		}
		
		opcion = entrada.nextInt();
		
		switch(opcion) {
		case 0:
			SalirDePrograma.terminarEjecucion();
			break;
		case 1:
			AgregarEquipo.crearEquipo();
			break;
		}
	}

}
