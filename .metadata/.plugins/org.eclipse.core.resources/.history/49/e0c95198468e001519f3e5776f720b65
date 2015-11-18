package com.ericsson.inversion;

public class Inversion {

	Double valor2;
	Double inicial;
	int anios;
	
	public Inversion(){}
	public Inversion(Double valor2){
		this.valor2 =valor2;
		this.inicial=valor2;
		this.anios=0;
	}
	
	public void calcular(Double valor1){
		Double temp=valor1;
		
		//PRIMER ANIO
		valor1=valor1+valor1*40/100;
		
		//SEGUNDO ANIO
		valor1=valor1-1500;
		
		//TERCER ANIO
		valor1=valor1+valor1*12/100;
		
		System.out.println("La inversion inicial de: " + temp + " al pasar tres anios, es: " + valor1);
	}
	
	//Incrementa por interes.
	public void incInteres(Double interes){
		this.valor2 =this.valor2 +this.valor2 *interes;
		this.anios ++;
	}
	
	//Incrementa una cantidad.
	public void incCantidad(Double cantidad){
		this.valor2 =this.valor2 +cantidad;
		this.anios ++;
	}
	
	//Decrementa por tasa
	public void decTasa(Double tasa){
		this.valor2 =this.valor2 -this.valor2 *tasa;
		this.anios ++;
	}
	
	//Decrementa una cantidad
	public void decCantidad(Double cantidad){
		this.valor2 =this.valor2 -cantidad;
		this.anios ++;
	}
	
	public  void mostrarCantidad(){
		System.out.println("La inversion inicial de: " + this.inicial + " al pasar "+ this.anios +" anios, es: " + this.valor2);
		
	}
}
