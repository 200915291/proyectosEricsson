
public class Persona {

	String nombre;
	int edad;
	float estatura;
	
	public Persona(String n, int e, float es){
		nombre=n;
		edad=e;
		estatura=es;			
	}
	
	public void correr(Double d, Double t){
		System.out.println(this.nombre +" run run a " + d/t + " m/s");
	}
	
}
