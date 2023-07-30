package com.info.fut5app.service.crear;


import com.info.fut5app.service.entrada.consola.IngresoPorScanner;
import com.info.fut5app.service.menu.VolverAMenu;

public class CondicionalAgregarEquipo {
	
	static int opcion;
	
	public static void creaUnEquipo() {

		do {
			AgregarEquipo.crearEquipo();
			System.out.println("¿DESEA AGREGAR OTRO EQUIPO? \n1- SÍ \n2- NO");
			opcion = IngresoPorScanner.entradaDeNumero();
		}while(opcion != 2);
		
		VolverAMenu.retornar();

	}
}