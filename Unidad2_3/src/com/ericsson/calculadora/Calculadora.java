package com.ericsson.calculadora;

public class Calculadora {
	private Double valor1;
	private Double valor2;
	private final Double IVA=12.0;
	
	
	public Calculadora() {
	}

	public Calculadora(Double valor1, Double valor2){
		this.valor1 =valor1;
		this.valor2 =valor2;
	}
	
	public void sumar(){
		if (verificarDatos())
			System.out.println("SUMA: " + (this.valor1 +this.valor2));
	}
	
	public void restar(){
		if (verificarDatos())
			System.out.println("RESTA: " + (this.valor1 -this.valor2));
	}

	public void dividir(){
		if (verificarDatos()){
			if (valor2==0.0)
				System.err.println("NO SE PUEDE DIVIDIR ENTRE 0");
			else				
				System.out.println("DIVISION: " + (this.valor1 /this.valor2));
		}
	}

	public void mod(){
		if (verificarDatos()){
			if (valor2==0.0)
				System.err.println("NO SE PUEDE OBTENER UN MOD ENTRE 0");
			else				
				System.out.println("MOD: " + (this.valor1 %this.valor2));
		}
	}

	public void obtenerIva(Double valor3){
		if (verificarDatos())
			System.out.println("IVA: " + (valor3 *IVA));
	}

	public boolean verificarDatos(){
		if(this.valor1==null || this.valor2 == null){
			System.err.println("Los valores no se han inicializado");
			return false;
		}
		return true;
	}
	
	public void setValores(Double valor1, Double valor2){
		this.valor1=valor1;
		this.valor2=valor2;		
	}

}
