package com.ericsson.simulacion;

public class HiloSimulacion extends Thread{
	
	private int MIN_HILO=0;     // No tendria sentido tener menos de un hilo.
	private int MAX_HILO=0;  // Este no es un valor maximo real, es solo para este ejercicio.
	private int MIN_DATOS=0;    
	private int MAX_DATOS=0;  
	private String proceso="";      
	private int numDatos=0;
	private int contDatos=0;
	
	
	
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
		if(numH>this.MAX_HILO)
			throw new ExceptionValorMaximoSuperado("No pueden existir mas de "+this.MAX_HILO+" hilos para este programa..");
		if(numH<this.MIN_HILO)
			throw new ExceptionValorInvalido("El numero minimo de hilos es "+this.MIN_HILO);
		if(numH<this.MIN_DATOS)
			throw new ExceptionValorInvalido("El numero minimo de datos es "+this.MIN_DATOS);
		if(numD<1)
			throw new ExceptionValorInvalido("El numero de lineas no puede ser menor de 1");
		if(numD>MAX_DATOS)
			throw new ExceptionValorMaximoSuperado("Valor maximo de datos "+this.MAX_DATOS+" exedido para este programa..");
	}

	public void setMIN_HILO(int mIN_HILO) {
		MIN_HILO = mIN_HILO;
	}

	public void setMAX_HILO(int mAX_HILO) {
		MAX_HILO = mAX_HILO;
	}

	public void setMIN_DATOS(int mIN_DATOS) {
		MIN_DATOS = mIN_DATOS;
	}

	public void setMAX_DATOS(int mAX_DATOS) {
		MAX_DATOS = mAX_DATOS;
	}


	
	
}
