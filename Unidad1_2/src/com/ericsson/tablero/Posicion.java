package com.ericsson.tablero;

public class Posicion {
	  int columna; 
	  int fila;
	  boolean equipo;
	  boolean pos_ocupada;
	
	  public Posicion(int columna, int fila, boolean pos_ocupada) {
		this.columna = columna;
		this.fila = fila;
		this.pos_ocupada = pos_ocupada;
	  } 
	  

}
