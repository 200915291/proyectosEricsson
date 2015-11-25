package com.ericsson.simulacion;

public class MainHiloSimulacion {

	
	public static void main(String[] args) {
		
		/* Indicar los valores que se desean para la simulacion, el valor maximo de hilos se puede
		   cambiar en la clase HiloSimulacion... */
		int hilos=1000; 
		int datos=10;
		
		HiloSimulacion hilo=new HiloSimulacion();
		try {
			hilo.confirmarValores(hilos, datos);
			for (int i=1; i<=hilos; i++){
				hilo=new HiloSimulacion(""+i, datos);
				hilo.start();
			}
		} catch (ExceptionValorInvalido | ExceptionValorMaximoSuperado e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
