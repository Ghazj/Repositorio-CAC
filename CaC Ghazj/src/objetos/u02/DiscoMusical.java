package objetos.u02;

public class DiscoMusical {
	
	private String titulo;
	private String autor;
	private int anioEdicion;
	private String formato;
	private boolean digital;
	
	public DiscoMusical() {
		
	}
	
	public DiscoMusical(int anioEdicion, String formato, boolean digital) {
		this.anioEdicion = anioEdicion;
		this.formato = formato;
		this.digital = digital;
	}
	
	public DiscoMusical(String titulo, String autor, int anioEdicion, String formato, boolean digital) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioEdicion = anioEdicion;
		this.formato = formato;
		this.digital = digital;
		
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAnioEdicion(int anioEdicion) {
		this.anioEdicion = anioEdicion;
	}
	
	public int getAnioEdicion() {
		return anioEdicion;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	
	public boolean getDigital() {
		return digital;
	}
	
	public boolean equals(DiscoMusical disco) {
		
		if (this.titulo.equals(disco.titulo) && this.autor.equals(disco.autor) && this.anioEdicion == disco.anioEdicion) {
			
		return true;
		}else {
			return false;
		}
	}
	
	/*public boolean equals(Object o) {
		DiscoMusical disco = (DiscosMusical) 0;
		if (this.titulo.equals(disco.titulo) && this.autor.equals(disco.autor) && this.anioEdicion == disco.anioEdicion) {
			
		return true;
		}else {
			return false;
		}
	}*/
	
	public String toString() {
		return "El titulo es " + titulo + "." + "\n" 
	+ "El autor es: " + autor + "." + "\n"  
	+"El anio de edicion: " + anioEdicion + "." + "\n" 
	+ "El formato es " + formato + "." + "\n" 
	+ "Y digital es: " + digital + "." + "\n";  
	}
}
