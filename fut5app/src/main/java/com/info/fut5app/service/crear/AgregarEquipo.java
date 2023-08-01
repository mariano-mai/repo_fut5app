package com.info.fut5app.service.crear;

import com.info.fut5app.domain.Equipo;

import com.info.fut5app.service.crear.jugador.IndexarJugadores;
import com.info.fut5app.service.informacion.InfoBasica;
import com.info.fut5app.service.informacion.capitania.EsCapitan;

public class AgregarEquipo {
	
	public static Equipo equipo;
	
	public static Equipo crearEquipo() {
		equipo = new Equipo();
		
		System.out.println("Nombre del Equipo\n");
		equipo.setNombreDeEquipo(InfoBasica.nombrar());
				
		System.out.println("Fecha de creación del Equipo\n");
		equipo.setFechaDeCreacion(InfoBasica.fecha());
		
		System.out.println("Información de los jugadores\n");
		equipo.setJugadores(IndexarJugadores.listarJugadores());
		
		
		//equipo.setEntrenador(AgregarEntrenador.crearEntrenador());
			
		EsCapitan.resetearCapitan();
		
		return equipo;
	} //fin de método crearEquipo
	
}
