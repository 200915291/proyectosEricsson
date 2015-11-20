package com.ericsson.atributos;

public class MainAtributos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atributos atr=new Atributos();
		atr.setHeight(90);
		atr.setWeight(78);
		atr.setDepth(89);
		
		System.out.println("Valor de height: " + atr.getHeight());
		System.out.println("Valor de weight: " + atr.getWeight());
		System.out.println("Valor de depth: " + atr.getDepth());

	}

}
