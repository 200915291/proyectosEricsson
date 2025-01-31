package com.ericsson.fechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas {
	
	String fecha;

	public Fechas(String fecha){
		this.fecha=fecha;
	}
	
	public void retornarCumple(){
		
		if(this.fecha ==null){
			System.err.println("Debes ingresar una fecha");
			return;
		}
		
		try {
			DateFormat darFormato=new SimpleDateFormat("MM/dd/yyyy");	
			Date fechaFormato=darFormato.parse(this.fecha);
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(fechaFormato);
		
			System.out.println("DIA: "+calendar.get(Calendar.DAY_OF_MONTH)); 
			System.out.println("MES: " + (calendar.get(Calendar.MONTH)+1)); 
			System.out.println("ANIO: "+ calendar.get(Calendar.YEAR)); 
	
		} catch (ParseException e) {
			System.err.println("Formato incorrecto en la fecha" + e.getMessage());		
		}
	}
}
