package com.ericsson.piezas;

public class Reina extends Pieza{

	public Reina(String color,int col, int fila){
		this.color=color;
		this.valor=9;
		this.tipo=REINA; 
		this.col_actual=col;
		this.fila_actual=fila;
		this.estado=true;
	}

	@Override
	public void mover_pieza(){}
	
	@Override
	public void validar_movimiento(){}
	
	@Override
	public void dar_de_baja(){}
}
