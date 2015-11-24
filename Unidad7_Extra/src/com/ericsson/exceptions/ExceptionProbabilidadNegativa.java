package com.ericsson.exceptions;

public class ExceptionProbabilidadNegativa extends Exception{
	
	/* Toda probabilidad debe ir en un rango de 0 a 1, siendo 1 igual al 100%, por tanto no puede 
	 * haber un valor negativo, de ser asi, se activa esta excepcion... */


	public ExceptionProbabilidadNegativa(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
