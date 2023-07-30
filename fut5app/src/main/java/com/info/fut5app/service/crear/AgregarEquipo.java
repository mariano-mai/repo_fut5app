package com.info.fut5app.service.crear;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

import com.info.fut5app.domain.Equipo;

import com.info.fut5app.service.crear.jugador.IndexarJugadores;
import com.info.fut5app.service.crear.jugador.MapearJugador;
import com.info.fut5app.service.entrada.consola.IngresoPorScanner;
import com.info.fut5app.service.informacion.InfoBasica;
import com.info.fut5app.service.informacion.capitania.EsCapitan;

public class AgregarEquipo {
	
	public static Equipo crearEquipo() {
		Equipo equipo = new Equipo();
		
		//nombrar el equipo
		equipo.setNombreDeEquipo(InfoBasica.nombrar());
		
		
		//darle fecha de creación
		System.out.println("Fecha de creación del Equipo");
		System.out.println("Ingrese Día: ");
		int diaDelMes = IngresoPorScanner.entradaDeNumero();
		System.out.println("Ingrese Mes (número): ");
		Month mes = Month.of(IngresoPorScanner.entradaDeNumero());
		System.out.println("Ingrese Año: ");
		int agno = IngresoPorScanner.entradaDeNumero();
		
		equipo.setFechaDeCreacion(LocalDate.of(agno, mes, diaDelMes));
		
		//agregarle jugadores
		equipo.setJugadores(IndexarJugadores.listarJugadores());
		
		//MapearJugador.infoDeJugadores();
		
		//designar entrenador
		//equipo.setEntrenador(AgregarEntrenador.crearEntrenador());
		
		Map<String,String> datosDelEquipo = new HashMap<String,String>();
		
		datosDelEquipo.put("Nombre del Equipo", Equipo.getNombreDeEquipo());
		datosDelEquipo.put("Fecha de Creación", diaDelMes+" - "+mes+" - "+agno);
		datosDelEquipo.put("Jugadores", IndexarJugadores.jugadores.toString());
		//datosDelEquipo.put("Entrenador", equipo.getEntrenador().toString());
		
		EsCapitan.resetearCapitan();
		
		return equipo;
	} //fin de método crearEquipo
	
}
