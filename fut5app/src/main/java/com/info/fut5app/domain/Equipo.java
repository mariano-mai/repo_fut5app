package com.info.fut5app.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
	static String nombreDeEquipo;
	LocalDate fechaDeCreacion;
	List<Jugador> jugadores;
	Entrenador entrenador;
	
	public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipo(String nombreDeEquipo, LocalDate fechaDeCreacion, List<Jugador> jugadores, Entrenador entrenador) {
		super();
		this.nombreDeEquipo = nombreDeEquipo;
		this.fechaDeCreacion = fechaDeCreacion;
		this.jugadores = jugadores;
		this.entrenador = entrenador;
	}

	public static String getNombreDeEquipo() {
		return nombreDeEquipo;
	}

	public void setNombreDeEquipo(String nombreDeEquipo) {
		this.nombreDeEquipo = nombreDeEquipo;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
	

}
