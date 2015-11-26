package com.ericsson.fileInput;

import java.io.*;

public class ByteReader {

	public static void main(String[] arguments) {

		leerCaracteres();
		leerlineas();
	}
	
	
	
	private static void leerCaracteres(){
		try {
			System.out.println("-----Iniciando el metodo de lectura de bytes-----");
			FileInputStream file = new FileInputStream("src/archivo.txt");
			boolean eof = false;
			int count = 0;
			while (!eof) {
				int input = file.read();
				System.out.print(input + " ");
				if (input == -1)
					eof = true;
				else
					count++;
			}
			file.close();
			System.out.println("\n\nBytes Leidos: " + count);

		} catch (IOException e) {
			System.out.println("Error — " + e.toString());
		}
	}
	
	private static void leerlineas(){
		try {
			System.out.println("\n\n-----Iniciando el metodo de lectura de lineas----");
			File file = new File("src/archivo.txt");
			FileReader contenido = new FileReader(file);
			BufferedReader lineas=new BufferedReader(contenido);
	        String linea;
	        int count=0;
	        while((linea=lineas.readLine())!=null){
				System.out.println(linea);
				count++;
			}
			contenido.close();
			System.out.println("Lineas Leidas: " + count);
		} catch (IOException e) {
			System.out.println("Error — " + e.toString());
		}
	}
}