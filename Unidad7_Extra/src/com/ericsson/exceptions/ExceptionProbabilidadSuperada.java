package com.ericsson.exceptions;

public class ExceptionProbabilidadSuperada extends Exception {
	
	/* Toda probabilidad debe ir en un rango de 0 a 1, siendo 1 igual al 100%, por tanto no puede 
	 * ser superado este valor, de ser superado se activa esta excepcion... */

	public ExceptionProbabilidadSuperada(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
