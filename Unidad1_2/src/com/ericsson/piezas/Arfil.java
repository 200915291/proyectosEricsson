package com.ericsson.piezas;

public class Arfil extends Pieza{

	public Arfil(String color,int col, int fila){
		this.color=color;
		this.valor=ARFIL;
		this.tipo=ARFIL;
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
