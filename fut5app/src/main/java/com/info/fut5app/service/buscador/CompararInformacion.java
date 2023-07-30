package com.info.fut5app.service.buscador;

import com.info.fut5app.service.crear.jugador.MapearJugador;
import com.info.fut5app.service.menu.VolverAMenu;

public class CompararInformacion {
	
	public static String valor1 = "";
	public static String valor2 = "";
	
	public static void comparar() {
		valor1 = IngresoDeInformacion.ingresarNombre();
		valor2 = MapearJugador.mapaDeJugadores.get("Nombre");
		
		if(valor1.equals(valor2)) {
			System.out.println("el jugador se llama "+valor2);
		}else {
			System.out.println("no hay jugador con ese nombre.");
		}
		System.out.println(valor2);
		VolverAMenu.retornar();
		
	}

}
