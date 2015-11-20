package com.ericsson.daycounter;

public class DayCounter {

	public static void main(String[] arguments) {
		int yearIn = 2008;
		int monthIn = 1;
		if (arguments.length > 0)
			monthIn = Integer.parseInt(arguments[0]);
		if (arguments.length > 1)
			yearIn = Integer.parseInt(arguments[1]);
		System.out.println(monthIn + "/" + yearIn + " has " + countDays(monthIn, yearIn) + " days.");
		mostrarDays(2015);
	}
	

	static int countDays(int month, int year) {
		int count = -1;
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				count = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				count = 30;
				break;
			case 2:
				if (year % 4 == 0)
					count = 29;
				else
					count = 28;
				if ((year % 100 == 0) & (year % 400 != 0))
					count = 28;
			}
		return count;
	}
	
	
	static void mostrarDays(int year) {
		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

		for (int i=0; i<12; i++){
			for(int j=0; j<countDays((i+1), year); j++){
				System.out.println(""+(j+1)+" de "+ meses[i]+ " del " + year);
			}
		}
	}
 } 

