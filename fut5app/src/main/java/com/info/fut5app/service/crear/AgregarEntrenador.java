package com.info.fut5app.service.crear;

import java.util.HashMap;
import java.util.Map;

import com.info.fut5app.domain.Entrenador;
import com.info.fut5app.service.crear.jugador.infoDeJugador.InfoBasica;

public class AgregarEntrenador {
	
	public static Entrenador crearEntrenador() {
		Entrenador coach = new Entrenador();
	
		coach.setNombre(InfoBasica.nombrar());
		coach.setApellido(InfoBasica.darApellido());		
		coach.setEdad(InfoBasica.darEdad());
			
		String edadEnt2 = " "+coach.getEdad();
			
		Map<String,String> empleados = new HashMap<String,String>();
			
		empleados.put("Nombre del Entrenador", coach.getNombre());
		empleados.put("Apellido del Entrenador", coach.getApellido());
		empleados.put("Edad del Entrenador", edadEnt2);
		
		System.out.println(empleados.toString());
		return coach;
	} //final del método crearEntrenador

}
