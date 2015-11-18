package com.ericsson.divisionmod;

public class DivisionMod {

	private Integer valor1;
	private Integer valor2;
	
    public DivisionMod(Integer valor1, Integer valor2){
    	this.valor1=valor1;
    	this.valor2=valor2;
    }
    
    public void obtenerValores(){
    	if (this.valor1!=null && this.valor2!=null ){
    		if (this.valor2!=0){
    			System.out.println("Dividendo: "+this.valor1);
    			System.out.println("Divisor: "+this.valor2);
    			System.out.println("Parte entera: "+(this.valor1/this.valor2)+" Restante: " + (this.valor1%this.valor2));
    		}else
    			System.err.println("No se puede dividir entre 0");
    	}else
			System.err.println("No se han indicado los valores");
    		
    }
}
