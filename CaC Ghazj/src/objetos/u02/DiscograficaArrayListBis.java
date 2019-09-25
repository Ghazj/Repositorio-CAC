package objetos.u02;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class DiscograficaArrayListBis {

	//Iterator<DiscoMusical>ite;
	//Asterisco
	private String nombre;
	private int anioCreacion;
	private ArrayList<DiscoMusical> discos;
	private int cont;
	
	public DiscograficaArrayListBis () {
	}
	
	public DiscograficaArrayListBis(String nombre, int anioCreacion, int tam) {
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
	
	public void AgregarDisco(DiscoMusical disco) { //
		discos.add(disco);
	}
	
	public String read(String mensaje) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		System.out.println(mensaje);
		String m = read.nextLine();
		return m;
	}
	
	public DiscoMusical buscarDisco() { //Find a disc by title.
		Iterator <DiscoMusical> ite = discos.iterator();
		String busqueda = read("Ingresa el titulo");
		boolean flag = false;
		int cont = 0;
		
		while(ite.hasNext()) {

			if(busqueda.toLowerCase().equals(ite.next().getTitulo().toLowerCase())) {
				flag = true;
				cont = cont++;
				break;
			}		
		}
		if(flag == true) {
			return discos.get(cont);
		} else {
			return null;
		}

	}
	
	public int buscar (DiscoMusical disco) {
		return discos.indexOf(disco);
		//return -1;
	}
	
	public  buscar () { //titulo, auto y año!!???????????
		
	}

	public String toString() {
		Iterator <DiscoMusical> ite = discos.iterator();
		//ArrayList <DiscoMusical> aux;
		String aux=""; 
		while (ite.hasNext()) {
			
		Object m = ite.next().toString();
		aux = aux + " " + m;
			}
		return "Discografica [nombre= " + nombre + "." + "\n" 
				+ "Año de creacion= " + anioCreacion + "." + "\n"
				+ "Discos= " + aux;
		}
	
public boolean existe(DiscoMusical d) {
	return discos.contains(d) ;
}
	
	
	
	}
	
