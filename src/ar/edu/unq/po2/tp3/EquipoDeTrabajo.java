package ar.edu.unq.po2.tp3;

import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombre;
	private List<Persona> integrantes;
	
	// Getters y Setters.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Persona> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}
	
	public int getPromedioDeEdades() {
		int sumaDeEdades = 0;
		for (Persona persona : integrantes) {
			sumaDeEdades += persona.getEdad();
		}
		return sumaDeEdades / integrantes.size();
	}
}
