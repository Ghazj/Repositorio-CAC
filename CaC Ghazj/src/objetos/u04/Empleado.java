package objetos.u04;

public class Empleado {
	// Atributos
	
	private String nombre;
	
	//constructor
	
	public Empleado(String nombre){
		this.nombre = nombre;
	}
	//métodos
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String toString() {
		return "Empleado: " + nombre;
	}
	
}
