package objetos.u04;

import objetos.u01.PersonaU4;

public class Cuenta {
////////////////////////////////////////////////
	private PersonaU4 titular;
	private double saldo;
/////////////////////////////////////////////////	
	public Cuenta() {}
	
	public Cuenta(int dniTitular) {
		titular = new PersonaU4(dniTitular);
	}
	
	public Cuenta(int dniTitular,double saldo) {
		titular = new PersonaU4(dniTitular);
		this.saldo = saldo;}
	
	public Cuenta(int dni,String nombre,int edad,String genero,double saldo) {
		PersonaU4 titular = new PersonaU4();
	}
////////////////////////////////////////////////	
	public String toString() {
		return "DNI: " + titular.getDni() + "\n" +
				"Saldo: " + saldo;
	}
	
	public int getDniTitular() {
		return titular.getDni();
	}
	
	/*public void setDniTitular(int dniTitular) {
		 = dniTitular;
	}*/
	
	public double getSaldo() {
		return saldo;
	}
	///////////////////////////////////////////
	public boolean depositar(double importe) {
		if (importe > 0){
			saldo = saldo+importe;
			return true; 
		}else {
			return false;
		}
	}
	
	public boolean extraer(double importe) {
		if (saldo - importe < 0) {
			return false;
		}else {
			saldo = saldo - importe;
			return true;
		}
	}
	
	
	
	
	
	
}
