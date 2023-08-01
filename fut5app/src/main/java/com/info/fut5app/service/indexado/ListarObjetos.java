package com.info.fut5app.service.indexado;

import java.util.ArrayList;
import java.util.List;

import com.info.fut5app.domain.Equipo;
import com.info.fut5app.service.crear.AgregarEquipo;
import com.info.fut5app.service.menu.VolverAMenu;

public class ListarObjetos {
	
	static List<Equipo> listaDeEquipos = new ArrayList<>();
	
	public static List<Equipo> listarEquipos(){
				
		listaDeEquipos.add(AgregarEquipo.equipo);
		return listaDeEquipos;
	}
	
	public static void mostrarEquipos() {
		System.out.println("Equipos Existentes\n");
		for(int i=0; i<listaDeEquipos.size(); i++) {
			System.out.println(listaDeEquipos.get(i).getNombreDeEquipo());
		}
		
		VolverAMenu.retornar();
	}

}
