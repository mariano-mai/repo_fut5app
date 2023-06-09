package com.info.fut5app.service.crear;

import java.util.Scanner;

import com.info.fut5app.service.menu.VolverAMenu;

public class CondicionalAgregarEquipo {
	
	static int opcion;
	
	public static void creaUnEquipo() {
		Scanner entrada = new Scanner(System.in);

		do {
			AgregarEquipo.crearEquipo();
			System.out.println("¿DESEA AGREGAR OTRO EQUIPO? \n1- SÍ \n2- NO");
			opcion = entrada.nextInt();
		}while(opcion != 2);
		
		VolverAMenu.retornar();

	}
}