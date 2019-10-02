package cine;

public class Butaca4D extends Butaca {

	private boolean vibracion;
	
	public Butaca4D(int fila,int num) {
		super(fila,num);
	}
	
	public void vibrar() {
		vibracion = true;
	}
	
	public void vibrar(int segundos) {
		vibracion = true;
	}
	
	public void encender() {
		
		super.encender();
		vibracion = true;
		this.vibrar(5);
		
	}
	
}
