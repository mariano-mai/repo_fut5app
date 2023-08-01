package com.info.fut5app.service.crear;


import com.info.fut5app.domain.Entrenador;
import com.info.fut5app.service.informacion.*;

public class AgregarEntrenador {
	
	public static Entrenador crearEntrenador() {
		Entrenador coach = new Entrenador();
	
		coach.setNombre(InfoBasica.nombrar());
		coach.setApellido(InfoBasica.darApellido());		
		coach.setEdad(InfoBasica.darEdad());
			
		return coach;
	} //final del método crearEntrenador

}
