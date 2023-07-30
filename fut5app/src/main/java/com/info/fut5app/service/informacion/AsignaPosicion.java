package com.info.fut5app.service.informacion;


import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class AsignaPosicion {
	
	static String valor = "";
	
	static String[] listaDePosiciones = {"Arquero", "Defensor", "Mediocampista", "Delantero"};
	
	static int opcion;
	
	public static String darPosicion() {
			
		System.out.println("Seleccione la posición del jugador: \n1: Arquero\n2: Defensor\n3: Mediocampista\n4: Delantero");
		opcion = IngresoPorScanner.entradaDeNumero();

		switch(opcion) {
			case 1:
				valor = listaDePosiciones[0];
				break;
			case 2:
				valor = listaDePosiciones[1];
				break;
			case 3:
				valor = listaDePosiciones[2];
				break;
			case 4:
				valor = listaDePosiciones[3];
				break;
		}
		return valor;
	}
}
