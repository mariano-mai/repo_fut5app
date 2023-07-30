package com.info.fut5app.service.menu;


import com.info.fut5app.service.buscador.CompararInformacion;
import com.info.fut5app.service.crear.CondicionalAgregarEquipo;
import com.info.fut5app.service.entrada.consola.IngresoPorScanner;
import com.info.fut5app.service.finDePrograma.SalirDePrograma;

public class MenuDeOpciones {
	
	static int opcion;
	
	public static void darOpciones() {
				
		System.out.println("\nBIENVENIDO AL MENÚ\n");
		System.out.println("SELECCIONE UNA OPCIÓN");
		
		System.out.println("0 - SALIR\n1 - AGREGAR EQUIPO\n2 - BUSCAR JUGADOR(en proceso)\n3 - BUSCAR EQUIPO(en proceso)");	
		opcion = IngresoPorScanner.entradaDeNumero();
		
		switch(opcion) {
		case 0:
			SalirDePrograma.terminarEjecucion();
			break;
		case 1:
			CondicionalAgregarEquipo.creaUnEquipo();
			break;
		case 2:
			CompararInformacion.comparar();
			break;
		}
	}

}
