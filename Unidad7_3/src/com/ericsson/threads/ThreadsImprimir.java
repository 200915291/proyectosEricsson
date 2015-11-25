package com.ericsson.threads;

public class ThreadsImprimir extends Thread{

	private String cadena="";
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(this.cadena);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
			}
		}
	}

	
	
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	
	
}
