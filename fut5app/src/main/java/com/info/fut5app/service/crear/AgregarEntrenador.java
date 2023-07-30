package com.info.fut5app.service.crear;

import java.util.HashMap;
import java.util.Map;

import com.info.fut5app.domain.Entrenador;
import com.info.fut5app.service.entrada.consola.IngresoPorScanner;

public class AgregarEntrenador {
	
	public static Entrenador crearEntrenador() {
		Entrenador coach = new Entrenador();
	
		System.out.println("Ingrese el nombre del entrenador: ");
		coach.setNombre(IngresoPorScanner.entradaDeTexto());
		System.out.println("Ingrese apellido del entrenador: ");
		coach.setApellido(IngresoPorScanner.entradaDeTexto());
			
		System.out.println("Ingrese edad del entrenador: ");
		coach.setEdad(IngresoPorScanner.entradaDeNumero());
			
		String edadEnt2 = " "+coach.getEdad();
			
		Map<String,String> empleados = new HashMap<String,String>();
			
		empleados.put("Nombre del Entrenador", coach.getNombre());
		empleados.put("Apellido del Entrenador", coach.getApellido());
		empleados.put("Edad del Entrenador", edadEnt2);
		
		System.out.println(empleados.toString());
		return coach;
	} //final del método crearEntrenador

}
