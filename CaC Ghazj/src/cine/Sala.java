package cine;

import java.util.Arrays;

public class Sala implements ISala4D {
	
	private int num;
	private Butaca[][] butacas;
	private int pasillo;
public Sala() {
	
}

public Sala(int filas, int asientos, int num,int pasillo) {
	this.num = num;
	butacas = new Butaca[filas][asientos];
	this.pasillo = pasillo;
	inicializarSala();
	
}


public void inicializarSala() {
	
	for(int i=0;i < butacas.length;i++) {
		
		for(int j=0;j<butacas[i].length;j++) {
			butacas[i][j] = new ButacaStandar(i,j);
			if (!(j == pasillo)) {
				
					butacas[i][j].desocupar();
					
			}else {
				butacas[i][j].pasillo();
			}
				
		}
			
	}
	
}

public void toStringButacas() {
	
for(int i=0;i < butacas.length;i++) {
		
		for(int j=0;j<butacas[i].length;j++) {
			
		System.out.print(butacas[i][j].getEstado());
			
}
		System.out.println("\n");
}
}


public String toString() {
	return "Número de sala: " + num + "\n" +
			"Pasillo: " + pasillo + "\n" +
			"Butacas: " + butacas + "";
			
}

public void ocuparVarias(int butacaSupIzqFila, int butacaSupIzqCol, int butacaInfDerFila, int butacaInfDerCol) {
	
for(int i=0;i < butacas.length;i++) {
		
		for(int j=0;j<butacas[i].length;j++) {
			butacas[i][j] = new ButacaStandar(i,j);
			if (!(j == pasillo)) {
				
					butacas[i][j].desocupar();
					
			}else {
				butacas[i][j].pasillo();
			}
				
		}
			
	}
	
}


public Butaca getButaca(int fila,int num) {
	
		return butacas[fila][num];
	
}

@Override
public void asignarSector4D(int butacaSupIzqFila, int butacaSupIzqCol, int butacaInfDerFila, int butacaInfDerCol) {
	
for(int i=0;i < butacas.length;i++) {
		
		for(int j=0;j<butacas[i].length;j++) {
			butacas[i][j] = new ButacaStandar(i,j);
			if (!(j == pasillo)) {
				
					butacas[i][j].desocupar();
					
			}else {
				butacas[i][j].pasillo();
			}
				
		}
			
	}
	
}


}