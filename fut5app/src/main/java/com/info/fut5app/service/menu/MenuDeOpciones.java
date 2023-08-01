package com.info.fut5app.service.menu;


import com.info.fut5app.service.buscador.CompararInformacion;
import com.info.fut5app.service.crear.CondicionalAgregarEquipo;
import com.info.fut5app.service.crear.jugador.IndexarJugadores;
import com.info.fut5app.service.entrada.consola.IngresoPorScanner;
import com.info.fut5app.service.finDePrograma.SalirDePrograma;
import com.info.fut5app.service.indexado.ListarObjetos;

public class MenuDeOpciones {
	
	static int opcion;
	
	public static void darOpciones() {
				
		System.out.println("\nBIENVENIDO AL MENÚ\n");
		System.out.println("SELECCIONE UNA OPCIÓN");
		
		System.out.println("0 - SALIR\n1 - AGREGAR EQUIPO\n2 - BUSCAR JUGADOR(en proceso)\n3 - MOSTRAR");	
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
		case 3:
			MenuDeOpciones.opcionesMostrar();
			break;
		}
	}
	
	private static void opcionesMostrar() {
		System.out.println("SELECCIONE UNA OPCIÓN");
		
		System.out.println("0 - VOLVER AL MENÚ\n1 - MOSTRAR TODOS LOS EQUIPOS\n2 - MOSTRAR TODOS LOS JUGADORES");
		opcion = IngresoPorScanner.entradaDeNumero();
		
		switch(opcion) {
		case 0:
			VolverAMenu.retornar();
			break;
		case 1:
			ListarObjetos.mostrarEquipos();
			break;
		case 2:
			IndexarJugadores.muestraJugadores();
			break;
		}
	}

}
