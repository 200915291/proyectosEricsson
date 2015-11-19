package com.ericsson.inversion;

public class MainInversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inversion inv=new Inversion();
		inv.calcular(14000.0);
		
		//Nota> Los porcentajes se deben expresar en punto decimal :)
		Inversion inv2=new Inversion(14000.00);
		inv2.incInteres(0.4);
		inv2.decCantidad(1500.00);
		inv2.incInteres(0.12);
		inv2.mostrarCantidad();
	}

}
