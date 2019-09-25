package objetos.u04;

public class Oficial extends Empleado   {

	
	public Oficial(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		return "Empleado: " + getNombre() + " --> Operario --> Oficial.";
		
	} 

}
