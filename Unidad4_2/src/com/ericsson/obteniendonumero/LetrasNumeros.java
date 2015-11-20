package com.ericsson.obteniendonumero;

public class LetrasNumeros {

	public static void main(String args[]){
		obtenerNumeros("ciento quince quince");
	}
	
	
	
	//METODO PARA OBTENER EL VALOR EN DECIMAL DE UN NUMERO EN CADENA DESDE 0 HASTA 1000
	private static void obtenerNumeros(String numEscrito){
		numEscrito=numEscrito.toLowerCase();
		String numDividido[]={"","","",""};
		String palabra="";
		int cont=0;
		
		if(numEscrito==null){
			System.out.print("No se ha especificado un numero");
			return;
		} 
		
		//SEPARACION EN PALABRAS DE LA CADENA INGRESADA
		for (int i=0; i<numEscrito.length();i++){
			if (cont>3){
				System.out.print("El numero no tiene un formato correcto");
				return;
			} 
			if(numEscrito.charAt(i)!=' ')
				palabra=palabra+numEscrito.charAt(i);
			else{
				numDividido[cont]=palabra;
				palabra="";
				cont++;
			}
		}		
		if(cont<4) numDividido[cont]=palabra;
		cont++;

		
		
		//OBTENCION DEL VALOR EN DECIMAL PARA LOS CASOS VALIDOS
		int resultado=0;
		int temp=0;
		switch (cont){
		
		//CENTENAS DECENAS Y UNIDADES
		case 4:
			temp=getCentenas(numDividido[0]);
			if(temp==-1){ 
				System.out.print("No se ha obtenido un valor de centena valido");
				return;
			} 
			resultado=resultado+temp;
			temp=getDecenas(numDividido[1]);
			if(temp==-1) {
				System.out.print("No se ha obtenido un valor de decena valido");
				return;
			} 
			resultado=resultado+temp;
			temp=getUnidades(numDividido[3]);
			if(temp==-1) {
				System.out.print("No se ha obtenido un valor de unidad valido");
				return;
			} 
			resultado=resultado+temp;
			break;
			
		//DECENAS Y UNIDADES
		case 3:
			temp=getDecenas(numDividido[0]);
			if(temp==-1) {
				System.out.print("No se ha obtenido un valor de decena valido");
				return;
			} 
			resultado=resultado+temp;
			temp=getUnidades(numDividido[2]);
			if(temp==-1) {
				System.out.print("No se ha obtenido un valor de unidad valido");
				return;
			} 
			resultado=resultado+temp;
			break;
		
		//CENTENAS DECENAS, CENTENAS CASOSDECENAS, CENTENAS UNIDADES
		case 2:
			temp=getCentenas(numDividido[0]);
			if(temp==-1){
				System.out.print("No se ha obtenido un valor de centena valido");
				return;
			} 
			resultado=resultado+temp;
			temp=getDecenas(numDividido[1]);
			if(temp==-1) temp=getUnidades(numDividido[1]);
			if(temp==-1) temp=getCasosDecenas(numDividido[1]);
			if(temp==-1) {
				System.out.print("No se ha obtenido un valor valido");
				return;
			} 
			resultado=resultado+temp;
			break;	
		
		//CENTENAS, DECENAS, CASOSDECENAS, UNIDADES, CASOSDEUNO
		case 1:
			temp=getCentenas(numDividido[0]);
			if(temp==-1) temp=getDecenas(numDividido[0]);
			if(temp==-1) temp=getCasosDecenas(numDividido[0]);
			if(temp==-1) temp=getUnidades(numDividido[0]);
			if(temp==-1) temp=getCasosDeUno(numDividido[0]);
			if(temp==-1) {
				System.out.print("No se ha obtenido un valor valido");
				return;
			} 
			resultado=resultado+temp;
			break;
		}
		System.out .println("Numero: " + resultado);
	}


	//VALORES DE CENTENAS
	private static int getCentenas(String cadena){
		switch (cadena.toLowerCase()){
			case "novecientos":
				return 900;
			case "ochocientos":
				return 800;
			case "setecientos":
				return 700;
			case "seiscientos":
				return 600;
			case "quinientos":
				return 500;
			case "cuatrocientos":
				return 400;
			case "trescientos":
				return 300;
			case "doscientos":
				return 200;
			case "ciento":
				return 100;
		}
		return -1;
	}

	//VALORES DE DECENAS
	private static int getDecenas(String cadena){
		switch (cadena.toLowerCase()){
			case "noventa":
				return 90;
			case "ochenta":
				return 80;
			case "setenta":
				return 70;
			case "sesenta":
				return 60;
			case "cincuenta":
				return 50;
			case "cuarenta":
				return 40;
			case "treinta":
				return 30;
		}
		return -1;
	}

	//VALORES DE UNIDADES
	private static int getUnidades(String cadena){
		switch (cadena.toLowerCase()){
			case "nueve":
				return 9;
			case "ocho":
				return 8;
			case "siete":
				return 7;
			case "seis":
				return 6;
			case "cinco":
				return 5;
			case "cuatro":
				return 4;
			case "tres":
				return 3;
			case "dos":
				return 2;
			case "uno":
				return 1;
		}
		return -1;
	}

	//VALORES DE CASOSDEUNO
	private static int getCasosDeUno(String cadena){
		switch (cadena.toLowerCase()){
			case "mil":
				return 90;
			case "cien":
				return 80;
			case "veinte":
				return 70;
			case "diez":
				return 60;
			case "cero":
				return 0;
		}
		return -1;
	}

	//VALORES DE CASOSDECENAS
	private static int getCasosDecenas(String cadena){
		switch (cadena.toLowerCase()){
			case "once":
				return 11;
			case "doce":
				return 12;
			case "trece":
				return 13;
			case "catorce":
				return 14;
			case "quince":
				return 15;
			case "dieciseis":
				return 16;
			case "diecisiete":
				return 17;
			case "dieciocho":
				return 18;
			case "diecinueve":
				return 19;
			case "veintiuno":
				return 21;
			case "veintidos":
				return 22;
			case "veintitres":
				return 23;
			case "veinticuatro":
				return 24;
			case "veinticinco":
				return 25;
			case "veintiseis":
				return 26;
			case "veintisiete":
				return 27;
			case "veintiocho":
				return 28;
			case "veintinueve":
				return 29;
		}
		return -1;
	}

}

