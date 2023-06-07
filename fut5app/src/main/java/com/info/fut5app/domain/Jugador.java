package com.info.fut5app.domain;

public class Jugador {
	
	int id, altura, cantGoles, cantPartidosJugados, numeroCamiseta;
	String nombre, apellido;
	boolean esCapitan;
	String posicion;
	Equipo equipo;
	
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jugador(int id, int altura, int cantGoles, int cantPartidosJugados, int numeroCamiseta, String nombre,
			String apellido, boolean esCapitan, String posicion, Equipo equipo) {
		super();
		this.id = id;
		this.altura = altura;
		this.cantGoles = cantGoles;
		this.cantPartidosJugados = cantPartidosJugados;
		this.numeroCamiseta = numeroCamiseta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.esCapitan = esCapitan;
		this.posicion = posicion;
		this.equipo = equipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getCantGoles() {
		return cantGoles;
	}

	public void setCantGoles(int cantGoles) {
		this.cantGoles = cantGoles;
	}

	public int getCantPartidosJugados() {
		return cantPartidosJugados;
	}

	public void setCantPartidosJugados(int cantPartidosJugados) {
		this.cantPartidosJugados = cantPartidosJugados;
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isEsCapitan() {
		return esCapitan;
	}

	public void setEsCapitan(boolean esCapitan) {
		this.esCapitan = esCapitan;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	

}
