package com.ericsson.carritofrutas;

import java.util.Iterator;
import java.util.Vector;

public class CarroFrutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Frutas> carrito = new Vector<>();
		
		Frutas fruta0=new Frutas("Uva", 10, 10.00F);
		carrito.add(fruta0);
		
		Frutas fruta1=new Frutas("Pera", 15, 5.00F);
		carrito.add(fruta1);
		
		Frutas fruta2=new Frutas("Melon", 3, 8.00F);
		carrito.add(fruta2);
		
		Frutas fruta3=new Frutas("Mandarina", 12, 5.00F);
		carrito.add(fruta3);
		
		Frutas fruta4=new Frutas("Manzana", 20, 40.00F);
		carrito.add(fruta4);
		
		
		Iterator<Frutas> cont=carrito.iterator();
		while(cont.hasNext())
			cont.next().MostrarFruta();
			
	}

}
