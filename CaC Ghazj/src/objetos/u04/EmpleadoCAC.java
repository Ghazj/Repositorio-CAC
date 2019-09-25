package objetos.u04;

public class EmpleadoCAC {
	//Atributos
	protected String nombre;
	protected String cedula;
	private int edad;
	private boolean casado;
	private double salario;
	//contrucctores
	public EmpleadoCAC(){
		
	}
	public EmpleadoCAC(String nombre,String cedula,int edad,boolean casado,double salario){
		this.nombre = nombre; this.cedula = cedula; this.edad = edad; this.casado = casado; this.salario = salario;
	}
	
	public String getCategoria() {
		if (edad <= 21) {
			return "Principiante";
		} if (edad >= 22 && this.edad <=35) {
			return "Intermedio";
		} if (edad > 35) {
			return "Senior";
		} else {
			return "";
		}
		
		
		
	}

	public String toString() {
		return "Nombre: " + nombre + "\n" +
			   "Cedula: " + cedula + "\n" +
			   "Edad: " + edad + "\n" +
			   "Casado: " + casado + "\n" +
			   "Salario: " + salario + ".";
	}
	
	public boolean aumentarSalario(int aumento) {
		 if (aumento > 0 && aumento < 31) {
			 salario += ((double)aumento / 100) * salario;
			 return true;
		 }else {
			 return false;
		 }
		 
		 
	}
	
	
	
	
	
}
