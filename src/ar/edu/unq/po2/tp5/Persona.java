package ar.edu.unq.po2.tp5;

import java.util.Date;

public class Persona extends SerVivo{
	private String nombre;
	private Date fechaDeNacimiento;
	
	public Persona(String nombre, Date fechaDeNacimiento) {
		super(nombre);
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
}