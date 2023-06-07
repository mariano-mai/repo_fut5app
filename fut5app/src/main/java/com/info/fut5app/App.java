package com.info.fut5app;

import com.info.fut5app.service.crear.AgregarEntrenador;
import com.info.fut5app.service.crear.AgregarEquipo;
import com.info.fut5app.service.crear.AgregarJugador;


public class App {

	public static void main(String[] args) {
		
		AgregarEntrenador.crearEntrenador();
		AgregarJugador.crearJugador();
		AgregarEquipo.crearEquipo();
	}
} //final de clase App
