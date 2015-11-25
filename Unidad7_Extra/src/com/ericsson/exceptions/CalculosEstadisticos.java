package com.ericsson.exceptions;

import javax.sql.rowset.spi.TransactionalWriter;

public class CalculosEstadisticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			//No produce Excepcion...
			darBienvenida("Erick");
			//No produce Excepcion...
			System.out.println("Resultado de una distribucion binomial> "+ distribucionBinomial(5, 2, 0.5, 0.5)); 
			//Produce Excepcion
			System.out.println("Resultado de una distribucion pascal> "+ distribucionPascal(5,3,0.3,0.8)); 
			 
		} catch (ExceptionConjuntoInvalido e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ExceptionDivisionEntreCero e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ExceptionNumeroNegativo e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ExceptionSumaProbabilidad e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ExceptionProbabilidadNegativa e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ExceptionProbabilidadSuperada e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ExceptionSubconjuntoInvalido e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ExceptionCeroEnPotencias e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ExceptionCamposVacios e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ExceptionCamposNulls e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Finalizacion de calculos... ");
	}

	
	
	
	
	
	
	
	public static int factorial(int num) throws ExceptionNumeroNegativo {
		if(num<0)
			throw new ExceptionNumeroNegativo("No se puede obtener el factorial de un numero negativo..");
		if(num==0 || num==1)
			return 1;
		num=num* factorial(num-1);
		return num;
	}

	
	
	
	
	
	public static Double division(int dividendo, int divisor) throws ExceptionDivisionEntreCero{
		if (divisor==0)
			throw new ExceptionDivisionEntreCero("No es posible una division entre 0");
		return (double) (dividendo/divisor);
	}
	
	
	
	
	
	
	
	public static Double permutacionSinRepeticion(int n, int r) throws ExceptionSubconjuntoInvalido, ExceptionNumeroNegativo, ExceptionConjuntoInvalido, ExceptionDivisionEntreCero{
		//n=tamanio del conjunto de elementos
		//r=tamanio del subconjunto que se desea obtener (exitos)
		if(r<0 || n<0)
			throw new ExceptionNumeroNegativo("No es posible calcular combinaciones con numeros negativos");
		if(n<1)
		    throw new ExceptionConjuntoInvalido("No es permitido un conjunto (n) menor o igual a 1");
		if(r>n)
		throw new ExceptionSubconjuntoInvalido("El subconjunto (r), no debe ser mayor al conjunto (n)");
		return division(factorial(n),factorial(n-r));
	}

	
	
	
	
	
	
	public static Double combinacionSinRepeticion(int n, int r) throws ExceptionSubconjuntoInvalido, ExceptionNumeroNegativo, ExceptionConjuntoInvalido, ExceptionDivisionEntreCero{
		//n=tamanio del conjunto de elementos
		//r=tamanio del subconjunto que se desea obtener (exitos)
				
		if(r<0 || n<0)
			throw new ExceptionNumeroNegativo("No es posible calcular combinaciones con numeros negativos");
		if(n<1)
		    throw new ExceptionConjuntoInvalido("No es permitido un conjunto (n) menor o igual a 1");
		if(r>n)
			throw new ExceptionSubconjuntoInvalido("El subconjunto (r), no debe ser mayor al conjunto (n)");
		return division(factorial(n),(factorial(r))*factorial(n-r));
	}
	
	
	
	
	
	
	
	public static Double distribucionBinomial(int n, int r, Double p, Double q) throws  ExceptionSumaProbabilidad, ExceptionProbabilidadNegativa, ExceptionProbabilidadSuperada, ExceptionSubconjuntoInvalido, ExceptionNumeroNegativo, ExceptionConjuntoInvalido, ExceptionDivisionEntreCero, ExceptionCeroEnPotencias{
		//n=tamanio del conjunto de elementos
		//r=tamanio del subconjunto que se desea obtener (exitos)
		//p=probabilidad de exito
		//q=probabilidad de fracaso
		if(p<0 || q<0)
			throw new ExceptionProbabilidadNegativa("Toda probabilidad debe ser menor a cero");
		if(p>1 || q>1)
			throw new ExceptionProbabilidadSuperada("Toda probabilidad no debe ser mayor a 1");
		if(p+q!=1)
			throw new ExceptionSumaProbabilidad("Las probabilidades 'p' y 'q' deben sumar 1");
		
		Double temp=0.0;
		temp=temp+combinacionSinRepeticion(n, r);
		temp=temp*potencia(p, (r+0.0))*potencia(q,(n-r)+0.0); 
		return temp;
	}
	
	
	
	
	
	
	
	public static Double distribucionPascal(int n, int r, Double p, Double q) throws  ExceptionSumaProbabilidad, ExceptionProbabilidadNegativa, ExceptionProbabilidadSuperada, ExceptionSubconjuntoInvalido, ExceptionNumeroNegativo, ExceptionConjuntoInvalido, ExceptionDivisionEntreCero, ExceptionCeroEnPotencias{
		//n=tamanio del conjunto de elementos
		//r=tamanio del subconjunto que se desea obtener (exitos)
		//p=probabilidad de exito
		//q=probabilidad de fracaso
		if(p<0 || q<0)
			throw new ExceptionProbabilidadNegativa("Toda probabilidad debe ser menor a cero");
		if(p>1 || q>1)
			throw new ExceptionProbabilidadSuperada("Toda probabilidad no debe ser mayor a 1");
		if(p+q!=1)
			throw new ExceptionSumaProbabilidad("Las probabilidades 'p' y 'q' deben sumar 1");
		
		Double temp=0.0;
		temp=temp+combinacionSinRepeticion((n-1), (r-1));
		temp=temp*potencia(p, (r+0.0))*potencia(q,(n-r)+0.0); 
		return temp;
	}
	
	
	
	
	
	
	
	public static Double potencia(Double base, Double exponente) throws ExceptionCeroEnPotencias{
		if(base==0.0 && exponente == 0.0)
			throw new ExceptionCeroEnPotencias("Resultado indeterminado en la operacion 0/0");
		if(base==0.0 && exponente<0.0)
			throw new ExceptionCeroEnPotencias("Division dentro de cero no permitida al ser el exponente negativo");
		return Math.pow(base, exponente);
	}
	
	
	
	
	
	
	
	public static void darBienvenida(String name) throws ExceptionCamposNulls, ExceptionCamposVacios{
		if(name==null)
			throw new ExceptionCamposNulls("Se ha obtenido un valor null en tu nombre, verifica tus datos...");
		if(name=="")
			throw new ExceptionCamposVacios("Tu nombre no puede ser un campo vacio...");
		
		String respuesta="Bienvenid@: " + name + " puedes obtener los siguientes calculos> \n"+
					     " Factorial \n"+
		                 " Division \n"+
		                 " Combinacion sin repeticion \n"+
		                 " Permutacion sin repeticion \n"+
		             	 " Potencia \n"+
		             	 " Distribucion Binomial \n"+
			             " Distribucion Binomial Negativa - Pascal \n"+
			         	 " --------------------------------------------- \n"+
			         	 " Espero que sea de utilidad :) \n";
		System.out.println(respuesta);
	}

}
