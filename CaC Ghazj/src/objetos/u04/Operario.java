package objetos.u04;

public class Operario extends Empleado   {

	
	public Operario(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		return "Empleado: " + getNombre() + " --> Operario.";
		
	}
	
	
}
