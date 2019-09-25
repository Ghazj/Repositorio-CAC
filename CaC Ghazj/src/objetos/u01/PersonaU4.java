package objetos.u01;

import objetos.u04.Domicilio;

public class PersonaU4 {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	private Domicilio domicilio;
	private boolean esMayorDeEdad;
	
	public PersonaU4(){
		domicilio = new Domicilio();
	}
	
	public PersonaU4(int dni) {
		this.dni = dni;
		domicilio = new Domicilio();
	}
	
	public PersonaU4(String nombre, String apellido, int edad, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		domicilio = new Domicilio();
	}
	
	public PersonaU4(String nombre, String apellido, int edad, int dni, String calle, 
			int piso, String departamento, String localidad, String provincia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.domicilio = new Domicilio(calle, piso, departamento, localidad, provincia);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String n) {
		apellido = n;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int e) {
		edad = e;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int e) {
		dni = e;
	}

	public String toString() {
		return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" +
	"Edad: " + edad + "\n" + "Dni: " + dni + "\n" + domicilio;
	}
	
	public boolean esMayorDeEdad(int edad) {
		if (edad >= 18) {
			esMayorDeEdad = true;
			return true;
		}else{ 
			esMayorDeEdad = false;
			return false;
		}
	}
	
}

