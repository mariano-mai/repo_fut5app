package com.info.fut5app.service.crear.jugador;

public class CondicionalEsCapitan {
	
	public static String defineCapitania() {
		if(EsCapitan.opcion != 1) {
			EsCapitan.esCapitan();
		}else{
		EsCapitan.noEsCapitan();
		}
		return EsCapitan.valor;
	}

}
