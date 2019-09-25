package objetos.u04;

public class Domicilio {

	private String calle;
	private int piso;
	private String departamento;
	private String localidad;
	private String provincia;
	
	public Domicilio(String calle, int piso, String departamento, String localidad, String provincia) {
		this.calle = calle;
		this.piso = piso;
		this.departamento = departamento;
		this.localidad = localidad;
		this.provincia = provincia;
	}


	public Domicilio() {
		// TODO Auto-generated constructor stub
	}


	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String toString() {
		return "\n" + "Domicilio" + "\n" + "Calle: " + calle + "\n" + "Piso: " + piso +"\n" +"Departamento: " 
	+ departamento + "\n" + "Localidad: " + localidad + "\n" + "Provincia: " + provincia;
	}
		
}
