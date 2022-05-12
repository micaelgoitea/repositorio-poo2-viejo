package ar.edu.unq.po2.tp5;

public class Mascota extends SerVivo {
	private String nombre;
	private String raza;

	public Mascota(String nombre, String raza) {
		super(nombre);
		this.nombre = nombre;
		this.raza = raza;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}

}
