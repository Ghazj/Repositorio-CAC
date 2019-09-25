package objetos.u04;

public class Programador extends EmpleadoCAC {

	private  int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	public Programador() {
		
	}
	
	public Programador(String nombre,String cedula,int edad,boolean casado,double salario) {
		super(nombre, cedula, edad, casado, salario);
	}
	
	public Programador(String nombre,String cedula,int edad,boolean casado,double salario,int lineasDeCodigoPorHora,String lenguajeDominante) {
		super(nombre, cedula, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}
	public void setLineasDeCodigoPorhora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}
	
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public String toString() {
		return "";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
