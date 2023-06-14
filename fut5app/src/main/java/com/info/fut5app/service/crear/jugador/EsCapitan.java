package com.info.fut5app.service.crear.jugador;

import java.util.Scanner;

public class EsCapitan {
	
	static String valor = "";
	
	static int opcion;
	
	public static String esCapitan() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿El jugador es capitán? \n1- SÍ\n2- NO");
		opcion = entrada.nextInt();
		
		switch(opcion) {
		case 1:
			valor = "SÍ";
			break;
		case 2:
			valor = "NO";
			break;
		}
		return valor;
	}

}
