package objetos.u01;

public class Persona {
	//Atributos
	protected String nombre;
	private String apellido;
	private int dni;
	private int edad;
		
	// Método constructor
	public Persona() {
		nombre = "";
		apellido = "";
		edad = 0;}
	
	public Persona(String nombre) {
		this.nombre = nombre;
		
		apellido = "";
		edad = 0;}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	
	// Metodo (comportamiento)
		public void saludar() {
			System.out.println("Hola");}
		
		public void caminar() {
			System.out.println("Caminando.....");}
		public String miNombre() {
			return nombre;
		}
}
