package com.info.fut5app.domain;

import java.util.ArrayList;
import java.util.List;

public class Posicion {
	
	String nombreDePosicion;
	List<Jugador> jugadores = new ArrayList<Jugador>();
	String[] listaDePosiciones = {"Arquero", "Defensor", "Mediocampista", "Delantero"};
	
	
	public String asignePosicion(String posicion) {
		return nombreDePosicion;
	}


	public String getListaDePosiciones(int i) {
		String valor = listaDePosiciones[i];
		return valor;
	}


	public void setListaDePosiciones(String[] listaDePosiciones) {
		this.listaDePosiciones = listaDePosiciones;
	}
	
}
