package com.ericsson.simulacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainHiloSimulacion {
	
	private static int hilos=0; 
	private static int datos=0;
	
	public static void main(String[] args) {
		HiloSimulacion hilo=new HiloSimulacion();
		leerConfiguraciones("src/configuraciones.txt", hilo);
		
		/* Indicar los valores que se desean para la simulacion, el valor maximo de hilos se puede
		   cambiar en el archivo de configuraciones... */
		
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
	
	
	
	
	
	public static void leerConfiguraciones(String directorio, HiloSimulacion hilo)  {
		File archivo=null;
		FileReader lectura=null;
		BufferedReader lineas=null;
		
	    try {
	         archivo = new File (directorio);
	         lectura = new FileReader (archivo);
	         lineas = new BufferedReader(lectura);
	 
	         String linea;
	         while((linea=lineas.readLine())!=null){
	        	 
	        	String parametros[] = linea.split("=");
	         	if (parametros.length!=2)
					throw new ExceptionArchivoConfiguraciones("El archivo de configuraciones tiene errores...");
	         	switch (parametros[0]){
	         	case "MIN_HILO":
	         		hilo.setMIN_HILO(Integer.parseInt(parametros[1])); break;
	         	case "MIN_DATOS":
	         		hilo.setMIN_DATOS(Integer.parseInt(parametros[1])); break;
	         	case "MAX_HILO":
	         		hilo.setMAX_HILO(Integer.parseInt(parametros[1])); break;
	         	case "MAX_DATOS":
	         		hilo.setMAX_DATOS(Integer.parseInt(parametros[1])); break;
	         	case "HILOS":
	         		hilos=Integer.parseInt(parametros[1]); break;
	         	case "DATOS":
	         		datos=Integer.parseInt(parametros[1]); break;
	         	default:
	         		throw new ExceptionArchivoConfiguraciones("El parametro: "+ parametros[0]+" no forma parte de las configuraciones validas, revise el archivo de configuraciones... ");
	         	}
	         	System.out.println("Configuracion agregada... "+ linea);
	         } 		
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	            try {
	            	if( lectura != null )  
	 	               lectura.close();    
	 	        } catch (Exception e2) {
	 		         e2.printStackTrace();
				}                
	      }
		
		
		
	}
	
}
