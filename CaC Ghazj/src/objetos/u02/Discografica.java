package objetos.u02;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
//Asterisco!!
public class Discografica {

	private String nombre;
	private int anioCreacion;
	private DiscoMusical[] discos;
	private int cont;
	
	public Discografica () {
	}
	
	public Discografica(String nombre, int anioCreacion, int tam) {
		this.nombre = nombre;
		this.anioCreacion = anioCreacion;
		discos = new DiscoMusical[tam];
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioCreacion() {
		return anioCreacion;
	}

	public void setAnioCreacion(int anioCreacion) {
		this.anioCreacion = anioCreacion;
	}

	public DiscoMusical[] getDiscos() {
		return discos;
	}

	public void setDiscos(DiscoMusical[] discos) {
		this.discos = discos;
	}
	
	public void AgregarDisco(DiscoMusical discos) { //
		cont++;
		this.discos[cont-1] = discos;
	}
	
	public String read(String mensaje) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		System.out.println(mensaje);
		String m = read.nextLine();
		return m;
	}
	
	public void buscarDisco() { //Find a disc by title.
		
		String busqueda = read("Ingresa el titulo");
		boolean flag = false;
		int cont = 0;
		
		for(int i = 0; i<discos.length; i++) {

			if(busqueda.toLowerCase().equals(discos[i].getTitulo().toLowerCase())) {
				flag = true;
				cont = i;
				break;
			}		
		}
		if(flag == true) {
			System.out.println("La información del disco: " + discos[cont]);
		} else {
			System.out.println("No existe");
		}
		
		
	}

	public String toString() {
		return "Discografica [nombre= " + nombre + "." + "\n" 
	+ "Año de creacion= " + anioCreacion + "." + "\n"
	+ "Discos= " + Arrays.toString(discos) + "]";
	}
}
