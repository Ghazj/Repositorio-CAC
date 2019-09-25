package objetos.u04;

import objetos.u01.Persona;

public class Alumno extends Persona {
//Atributos
	
	private int matricula;
	
	//Contructores
	public Alumno() {}
	public Alumno(String nombre, String matricula){
		super(nombre);
		
		
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getMatricula() {
		return this.matricula;
	}
	
	
	
	public String toString() {
		return "Nombre: " + getNombre() + "Matricula: " + matricula + ".";
	}
	
}
