package com.ericsson.exceptions;

public class ExceptionSumaProbabilidad extends Exception{
	
	/* Toda probabilidad debe ir en un rango de 0 a 1, siendo 1 igual al 100%, por tanto no puede 
	 * ser superado este valor, si la suma de varias probabilidades dentro de un mismo problema
	 * supera el valor maximo (1), se activa esta excepcion... */


	public ExceptionSumaProbabilidad(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
