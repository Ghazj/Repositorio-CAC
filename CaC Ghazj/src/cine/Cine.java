package cine;

import java.util.ArrayList;

public class Cine {
	
	private ArrayList cartelera;
	private ArrayList salas;
	private ArrayList reservas;
	private String nombre;
	private boolean estado;
	
	public Cine() {
		
	}
	
	public Cine(String nombre,boolean estado){
		this.nombre = nombre;
		this.estado = estado;
		cartelera = new ArrayList<>();
		salas = new ArrayList<>();
		reservas = new ArrayList<>();
	}
	
}

	