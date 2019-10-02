package cine;

public abstract class Butaca {
	///////////////////////////////7
	private int fila;
	private int num;
	private String estado;
	protected boolean luz;
	//////////////////////////////
	
	public Butaca() {
		
	}
	
	public Butaca(int fila,int num) {
		this.fila = fila;
		this.num = num;
		this.estado = "";
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getEstado() {
		return estado;
	}
	/*public void setEstado(char estado) {
		this.estado = estado;
	}*/
	
	public boolean ocupar(){
		if (!estado.equals("X")) {
			estado = "O";
			return true;
		}else {
			return false;
		}
	}
	
	public boolean desocupar() {
		if (!estado.equals("X")) {
			estado = "L";
			return true;
		} else {
			return false;
		}
	}
	
	public boolean pasillo() {
		estado = "X";
		return true;
	}

	public void encender() {
		luz = true;
	}
	
	public String toString() {
		return "Butaca [fila=" + fila + ", num=" + num + ", estado=" + estado + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
