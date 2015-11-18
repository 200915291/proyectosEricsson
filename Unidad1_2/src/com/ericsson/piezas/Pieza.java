package com.ericsson.piezas;

public class Pieza {
	static final int REY=0;
	static final int PEON=1;
	static final int CABALLO=2;
	static final int ARFIL=3;
	static final int REINA=4;
	static final int TORRE=5;
		
	String color;
	int valor;
	int tipo; 
	int col_actual;
	int fila_actual;
	boolean estado; //true=en el juego, false=fuera de juego
	
	
	public void mover_pieza(){}
	public void validar_movimiento(){}
	public void dar_de_baja(){}
	public void mover_pieza(int col, int fila) {
		// TODO Auto-generated method stub
		
	}
	
	
}
