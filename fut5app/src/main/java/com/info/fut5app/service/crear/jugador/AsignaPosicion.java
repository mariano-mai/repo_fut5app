package com.info.fut5app.service.crear.jugador;

import java.util.Scanner;

public class AsignaPosicion {
	
	static String valor = "";
	
	static String[] listaDePosiciones = {"Arquero", "Defensor", "Mediocampista", "Delantero"};
	
	static int opcion;
	
	public static String darPosicion() {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Seleccione la posición del jugador: \n1: Arquero\n2: Defensor\n3: Mediocampista\n4: Delantero");
		opcion = entrada.nextInt();

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
