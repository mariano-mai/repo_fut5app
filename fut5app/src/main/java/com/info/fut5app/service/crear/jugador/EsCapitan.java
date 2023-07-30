package com.info.fut5app.service.crear.jugador;


import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class EsCapitan {
	
	static String valor = "";
	
	static int opcion;
	
	public static String esCapitan() {
				
		System.out.println("¿El jugador es capitán? \n1- SÍ\n2- NO");
		opcion = IngresoPorScanner.entradaDeNumero();
		
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
	
	public static String noEsCapitan() {
		valor = "NO";
		return valor;
	}
	
	public static void resetearCapitan() {
		opcion = 0;
	}

}
