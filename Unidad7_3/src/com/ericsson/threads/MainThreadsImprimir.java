package com.ericsson.threads;

public class MainThreadsImprimir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsImprimir casoA=new ThreadsImprimir ();
		ThreadsImprimir casoB=new ThreadsImprimir ();
		
		casoA.setCadena("Primer thread");
		casoB.setCadena("Segundo thread");
		
		casoA.start();
		casoB.start();
		
	}

}
