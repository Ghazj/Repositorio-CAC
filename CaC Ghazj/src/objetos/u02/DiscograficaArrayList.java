package objetos.u02;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class DiscograficaArrayList {

	private String nombre;
	private int anioCreacion;
	private ArrayList<DiscoMusical> discos;
	private int cont;
	
	public DiscograficaArrayList () {
	}
	
	public DiscograficaArrayList(String nombre, int anioCreacion, int tam) {
		this.nombre = nombre;
		this.anioCreacion = anioCreacion;
		//discos = new DiscoMusical[tam];
		discos = new ArrayList<>();
		
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

	/*public DiscoMusical[] getDiscos() {
		return discos;
	}

	public void setDiscos(DiscoMusical[] discos) {
		this.discos = discos;
	}*/
	
	public boolean AgregarDisco(DiscoMusical disco) { //
		return discos.add(disco);
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
		
		for(int i = 0; i<discos.size(); i++) {

			if(busqueda.toLowerCase().equals(discos.get(i).getTitulo().toLowerCase())) {
				flag = true;
				cont = i;
				break;
			}		
		}
		if(flag == true) {
			System.out.println("La información del disco: " + discos.get(cont).toString());
		} else {
			System.out.println("No existe");
		}
		
		
	}

	public String toString() {
		return "Discografica [nombre= " + nombre + "." + "\n" 
	+ "Año de creacion= " + anioCreacion + "." + "\n"
	+ "Discos= " + discos.toString() + "]";
	}
}
