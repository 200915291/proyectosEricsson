package com.ericsson.simulacion;

public class HiloSimulacion extends Thread{
	
	private final int MIN=1;     // No tendria sentido tener menos de un hilo.
	private final int MAX=1000;  // Este no es un valor maximo real, es solo para este ejercicio.
	private String proceso;      
	private int numDatos;
	private int contDatos;
	
	
	
	// Constructores
	public HiloSimulacion() {
	}
	
	public HiloSimulacion(String proceso, int numDatos) {
		super();
		this.proceso = proceso;
		this.numDatos = numDatos;
	}
	
	
	
	
	// Metodo Run
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			System.out.println("Iniciando el proceso # "+this.proceso);
			this.contDatos=1;
			while(this.contDatos<=this.numDatos){
				try {
					System.out.println("-> Linea "+this.contDatos+" - Proceso # "+this.proceso);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
				this.contDatos++;
			}
	}
	
	
	
	
	
	// Metodos
	public  void confirmarValores(int numH, int numD) throws ExceptionValorInvalido, ExceptionValorMaximoSuperado{
		if(numH>this.MAX)
			throw new ExceptionValorMaximoSuperado("No pueden existir mas de "+this.MAX+" hilos para este programa..");
		if(numH<this.MIN)
			throw new ExceptionValorInvalido("El numero minimo de hilos es "+this.MIN);
		if(numD<1)
			throw new ExceptionValorInvalido("El numero de lineas no puede ser menor de 1");
	}


	
	
}
