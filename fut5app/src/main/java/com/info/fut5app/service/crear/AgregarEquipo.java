package com.info.fut5app.service.crear;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.info.fut5app.domain.Equipo;

public class AgregarEquipo {
	
	public static Equipo crearEquipo() {
		Equipo equipo = new Equipo();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del equipo: ");
		equipo.setNombreDeEquipo(entrada.nextLine());
		
		System.out.println("Fecha de creación del Equipo");
		System.out.println("Ingrese Día: ");
		int diaDelMes = entrada.nextInt();
		System.out.println("Ingrese Mes (número): ");
		Month mes = Month.of(entrada.nextInt());
		System.out.println("Ingrese Año: ");
		int agno = entrada.nextInt();
		
		equipo.setFechaDeCreacion(LocalDate.of(agno, mes, diaDelMes));
		
		equipo.setJugadores(IndexarJugadores.listarJugadores());
		
		equipo.setEntrenador(AgregarEntrenador.crearEntrenador());
		
		Map<String,String> datosDelEquipo = new HashMap<String,String>();
		
		datosDelEquipo.put("Nombre del Equipo", equipo.getNombreDeEquipo());
		datosDelEquipo.put("Fecha de Creación", diaDelMes+" - "+mes+" - "+agno);
		datosDelEquipo.put("Jugadores", IndexarJugadores.listaDeJugadores.toString());
		datosDelEquipo.put("Entrenador", equipo.getEntrenador().toString());
		
		System.out.println(datosDelEquipo.toString());
		return equipo;
	} //fin de método crearEquipo
	
}
