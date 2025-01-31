package com.ericsson.tablero;

public class Tablero {
	boolean equipo=true;
	public Posicion tablero[][] = new Posicion[8][8];

	public void liberar_posicion(){}
	public void ocupar_posicion(){}
	
	
	public Tablero() {
		this.equipo = false;
		for (int i=0; i<8; i++){
		    for (int j=0; j<8; j++){
  			    tablero[i][j]=null;
			}
		}
    }
	
	public void crear_tablero(){
		Posicion temp_pos;
		for (int i=0; i<8; i++){
		    for (int j=0; j<8; j++){
  			    equipo=!equipo;		    
				temp_pos=new Posicion(i,j,false);
  			    temp_pos.equipo =equipo;
  			    tablero[i][j]=temp_pos;
			}
		    equipo=!equipo;		    		
		}
	}
	
	public void dibujar_tablero(){
	    System.out.println("-------------------------");
	    Posicion temp_pos;
		for (int i=0; i<8; i++){
		    System.out.println("");
		    for (int j=0; j<8; j++){
  			    temp_pos=tablero[i][j];
  			    if (temp_pos.equipo)
  			    	System.err.print("[]");
  			    else
  			    	System.out.print("[]");
		    }
		}
	}
}
