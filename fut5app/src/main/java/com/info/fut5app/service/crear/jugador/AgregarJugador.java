package com.info.fut5app.service.crear.jugador;

import java.util.UUID;

import com.info.fut5app.domain.Jugador;
import com.info.fut5app.service.crear.AgregarEquipo;
import com.info.fut5app.service.informacion.AsignaPosicion;
import com.info.fut5app.service.informacion.InfoBasica;
import com.info.fut5app.service.informacion.InfoDeJugador;
import com.info.fut5app.service.informacion.capitania.CondicionalEsCapitan;

public class AgregarJugador {
	
	public static Jugador jugador;
	
	public static Jugador crearJugador() {
		jugador = new Jugador(AgregarEquipo.auxliarNombreDeEquipo);
			
		jugador.setId(UUID.randomUUID());
		
		jugador.setNombre(InfoBasica.nombrar());
		jugador.setApellido(InfoBasica.darApellido());
		//jugador.setAltura(InfoBasica.darAltura());
		
		jugador.setPosicion(AsignaPosicion.darPosicion());
		jugador.setEsCapitan(CondicionalEsCapitan.defineCapitania());
		//jugador.setNumeroCamiseta(InfoDeJugador.camiseta());
		//jugador.setCantPartidosJugados(InfoDeJugador.partidos());
		//jugador.setCantGoles(InfoDeJugador.goles());
				
		return jugador;
	} //final de método crearJugador

}
