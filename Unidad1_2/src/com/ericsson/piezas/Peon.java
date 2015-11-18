package com.ericsson.piezas;

public class Peon extends Pieza{

	public Peon(String color,int col, int fila){
		this.color=color;
		this.valor=PEON;
		this.tipo=PEON;
		this.col_actual=col;
		this.fila_actual=fila;
		this.estado=true;
	}

	@Override
	public void mover_pieza(int col, int fila){
		
		
	}
	
	@Override
	public void validar_movimiento(){}
	
	@Override
	public void dar_de_baja(){}

	
}
