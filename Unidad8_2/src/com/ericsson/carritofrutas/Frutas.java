package com.ericsson.carritofrutas;

public class Frutas {

	private String nombre;
	private int cantidad;
	private float precio;
	
	
	
	public Frutas(String nombre, int cantidad, float precio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public void MostrarFruta(){
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Cantidad: " + this.cantidad);
		System.out.println("Precio: " + this.precio + "\n");
	}
}
